package com.example.shelter.controllers;

import com.example.shelter.models.Animal;
import com.example.shelter.services.AnimalService;
import com.example.shelter.services.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController("/animal")
public class AnimalController {

  private AnimalService animalService;

  @Autowired
  public AnimalController(AnimalServiceImpl animalService) {
    this.animalService = animalService;
  }

  @PostMapping(value = "/save")
  public Animal save(@RequestBody Animal animal){
    return animalService.saveAnimal(animal);
  }

  @GetMapping(value = "/{id}")
  public Animal getAnimal(@PathVariable(value = "id") UUID id){
    return animalService.getAnimal(id);
  }
}
