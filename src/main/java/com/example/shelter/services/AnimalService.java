package com.example.shelter.services;

import com.example.shelter.models.Animal;
import com.example.shelter.models.Question;

import java.util.List;

public interface AnimalService {

  List<Animal> getAnimals();

  Animal saveAnimal(Animal animal);

  Animal getAnimal(Long id);

  Animal askQuestion(Long animalId, Question question) throws Exception;
}
