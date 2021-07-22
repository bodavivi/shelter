package com.example.shelter.services;

import com.example.shelter.models.Animal;
import com.example.shelter.models.Question;
import com.example.shelter.repositories.AnimalRepository;
import com.example.shelter.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
  private AnimalRepository animalRepository;
  private QuestionRepository questionRepository;

  @Autowired
  public AnimalServiceImpl(AnimalRepository animalRepository, QuestionRepository questionRepository) {
    this.animalRepository = animalRepository;
    this.questionRepository = questionRepository;
  }

  @Override
  public List<Animal> getAnimals() {
    return animalRepository.findAll();
  }

  @Override
  public Animal saveAnimal(Animal animal) {
    return animalRepository.save(animal);
  }

  @Override
  public Animal getAnimal(Long id) {
    return animalRepository.findById(id).orElse(null);
  }

  @Override
  public Animal askQuestion(Long animalId, Question question) throws Exception {
    Animal animal = getAnimal(animalId);
    if (animal != null) {
      //questionRepository.save(question);
      animal.addQuestion(question);
      animalRepository.save(animal);
    } else {
      throw new Exception("There is no animal with id: " + animalId);
    }
    return animal;
  }


}
