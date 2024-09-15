package com.nikesh.circlepeapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "source_station_id")
    private SpaceStation sourceStation;

    @ManyToOne
    @JoinColumn(name = "destination_station_id")
    private SpaceStation destinationStation;

    private String commodity;
    private int quantity;
    private double price;
    private LocalDateTime tradeTime;
}
