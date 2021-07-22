package com.example.shelter.models;

import javax.persistence.*;

@Entity
public class Question extends Comment {
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "answer_id", referencedColumnName = "id")
  private Answer Answer;

  @ManyToOne
  private Animal animal;

  public Answer getAnswer() {
    return Answer;
  }

  public void setAnswer(Answer answer) {
    Answer = answer;
  }

  public Animal getAnimal() {
    return animal;
  }

  public void setAnimal(Animal animal) {
    this.animal = animal;
  }
}