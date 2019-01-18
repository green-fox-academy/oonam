package com.gfa.programmerfoxclub.Model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Fox {
  private int nextId;

  private int id;
  private String name;
  private String food;
  private String drink;
  private List<String> tricks;

  public Fox() {
    this.id = nextId++;
    this.name = "";
    this.food = "lasagne";
    this.drink = "Jim Beam";
    this.tricks = null;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }
}
