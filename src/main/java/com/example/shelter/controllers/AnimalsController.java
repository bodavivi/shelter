package com.example.shelter.controllers;

import com.example.shelter.models.Animal;
import com.example.shelter.services.AnimalService;
import com.example.shelter.services.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalsController {

  private AnimalService animalService;

  @Autowired
  public AnimalsController(AnimalServiceImpl animalService) {
    this.animalService = animalService;
  }

  @GetMapping(value = {"", "/all"})
  public List<Animal> getAllAnimals() {
    return animalService.getAnimals();
  }
}
