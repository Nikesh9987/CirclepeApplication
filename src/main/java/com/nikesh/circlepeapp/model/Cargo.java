package com.nikesh.circlepeapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "source_station_id")
    private SpaceStation sourceStation;

    @ManyToOne
    @JoinColumn(name = "destination_station_id")
    private SpaceStation destinationStation;

    private String cargoType;
    private int weight;
}
