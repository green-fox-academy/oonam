package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    super.nameOfInstrument = "Violin";
    super.numberOfStrings = 4;
  }

  public Violin(int numberOfStrings) {
    super.nameOfInstrument = "Violin";
    super.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(nameOfInstrument + " has " + numberOfStrings + " strings with " + sound());
  }
}
