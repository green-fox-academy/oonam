package com.gfa.todo3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isDone;
  private boolean isUrgent;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    this.isDone = false;
    this.isUrgent = false;
  }

  public Todo(String title, boolean isDone, boolean isUrgent) {
    this.title = title;
    this.isDone = isDone;
    this.isUrgent = isUrgent;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }
}
