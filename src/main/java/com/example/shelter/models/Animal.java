package com.example.shelter.models;

import com.example.shelter.enums.AnimalTypeEnum;
import com.example.shelter.enums.GenderEnum;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private AnimalTypeEnum type;
  private String name;
  private LocalDate birthDate;
  private GenderEnum gender;
  private String description;

  public Animal() {
    this.questions = new ArrayList<>();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @OneToMany(
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )

  private List<Question> questions = new ArrayList<>();

  public AnimalTypeEnum getType() {
    return type;
  }

  public void setType(AnimalTypeEnum type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Question> getQuestions() {
    if (questions == null) {
      questions = new ArrayList<>();
    }
    return questions;
  }

  public void addQuestion(Question question) {
    questions.add(question);
  }

}
