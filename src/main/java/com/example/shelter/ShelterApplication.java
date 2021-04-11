package com.example.shelter;

import com.example.shelter.repositories.AnimalRepository;
import com.example.shelter.services.AnimalServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShelterApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShelterApplication.class, args);
  }
}
