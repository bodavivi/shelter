package com.example.shelter.services;

import com.example.shelter.models.Animal;

import java.util.List;

public interface AnimalService {

  List<Animal> getAnimals();

  Animal saveAnimal(Animal animal);
}
