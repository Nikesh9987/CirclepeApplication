package com.nikesh.circlepeapp.dto;


import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class AuthRequest {


    private String username;
    private String password;

    // Getters and Setters


}
