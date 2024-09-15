package com.nikesh.circlepeapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class SpaceStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    @OneToMany(mappedBy = "spaceStation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inventory> inventoryItems = new ArrayList<>();

    @OneToMany(mappedBy = "sourceStation")
    private List<Cargo> sourceCargos = new ArrayList<>();

    @OneToMany(mappedBy = "destinationStation")
    private List<Cargo> destinationCargos = new ArrayList<>();

    @OneToMany(mappedBy = "sourceStation")
    private List<Trade> sourceTrades = new ArrayList<>();

    @OneToMany(mappedBy = "destinationStation")
    private List<Trade> destinationTrades = new ArrayList<>();

}
