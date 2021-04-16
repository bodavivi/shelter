package com.example.shelter.services;

import com.example.shelter.models.Animal;

import java.util.List;
import java.util.UUID;

public interface AnimalService {

  List<Animal> getAnimals();

  Animal saveAnimal(Animal animal);

  Animal getAnimal(UUID id);
}
