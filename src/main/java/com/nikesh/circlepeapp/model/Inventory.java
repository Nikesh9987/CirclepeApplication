package com.nikesh.circlepeapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "space_station_id")
    private SpaceStation spaceStation;
}
