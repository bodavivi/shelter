package com.example.shelter.controllers;

import com.example.shelter.models.Animal;
import com.example.shelter.services.AnimalService;
import com.example.shelter.services.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

  private AnimalService animalService;

  @Autowired
  public AnimalController(AnimalServiceImpl animalService) {
    this.animalService = animalService;
  }

  @GetMapping(value = "/animals")
  public List<Animal> getAllAnimals(){
    return animalService.getAnimals();
  }

  @PostMapping(value = "/save")
  public Animal save(
      @RequestBody Animal animal
  ){
    return animalService.saveAnimal(animal);
  }
}
