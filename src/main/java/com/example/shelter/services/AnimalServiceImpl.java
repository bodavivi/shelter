package com.example.shelter.services;

import com.example.shelter.models.Animal;
import com.example.shelter.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AnimalServiceImpl implements AnimalService {
  private AnimalRepository animalRepository;

  @Autowired
  public AnimalServiceImpl(AnimalRepository animalRepository) {
    this.animalRepository = animalRepository;
  }

  @Override
  public List<Animal> getAnimals(){
    return animalRepository.findAll();
  }

  @Override
  public Animal saveAnimal(Animal animal){
    return animalRepository.save(animal);
  }

  @Override
  public Animal getAnimal(UUID id) {
    return animalRepository.findById(id).orElse(null);
  }
}
