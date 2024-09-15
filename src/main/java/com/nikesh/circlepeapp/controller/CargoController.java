package com.nikesh.circlepeapp.controller;


import com.nikesh.circlepeapp.model.Cargo;
import com.nikesh.circlepeapp.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cargo")
public class CargoController {

//    @GetMapping("/test")
//    public String testEndpoint() {
//        return "Cargo Controller is working!";
//    }

    @Autowired
    private final CargoService cargoService;

//    @Autowired
//    private SpaceStationRepository spaceStationRepository;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @PostMapping
    public ResponseEntity<Cargo> createCargo(@RequestBody Cargo cargo) {
        Cargo createdCargo = cargoService.createCargo(cargo);
        return ResponseEntity.ok(createdCargo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> getCargo(@PathVariable Long id) {
        Cargo cargo = cargoService.getCargo(id);
        return ResponseEntity.ok(cargo);
    }
}
