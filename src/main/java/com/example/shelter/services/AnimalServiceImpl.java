package com.example.shelter.services;

import com.example.shelter.models.Animal;
import com.example.shelter.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
  private AnimalRepository animalRepository;

  @Autowired
  public AnimalServiceImpl(AnimalRepository animalRepository) {
    this.animalRepository = animalRepository;
  }

  public List<Animal> getAnimals(){
    return animalRepository.findAll();
  }

  public Animal saveAnimal(Animal animal){
    return animalRepository.save(animal);
  }
}
