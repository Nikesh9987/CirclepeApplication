package com.nikesh.circlepeapp.service;


import com.nikesh.circlepeapp.model.Cargo;
import com.nikesh.circlepeapp.repository.CargoRepository;
import org.springframework.stereotype.Service;

@Service
public class CargoService {
    private final CargoRepository cargoRepository;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public Cargo createCargo(Cargo cargo){
        return cargoRepository.save(cargo);
    }

    public Cargo getCargo (Long id){
        return cargoRepository.findById(id).orElseThrow(()-> new RuntimeException("Cargo not Found"));

    }
}
