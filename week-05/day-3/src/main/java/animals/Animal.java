package main.java.animals;

abstract public class Animal {
  protected String name;
  protected int age;
  protected String gender;
  protected String color;

  public Animal() {

  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  abstract public String breed();

  public void walk(){

  }
}
