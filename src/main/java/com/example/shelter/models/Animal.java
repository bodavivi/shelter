package com.example.shelter.models;

import com.example.shelter.enums.AnimalTypeEnum;
import com.example.shelter.enums.GenderEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Animal {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID id;
  private AnimalTypeEnum type;
  private String name;
  private LocalDate birthDate;
  private GenderEnum gender;
  private String description;

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
}
