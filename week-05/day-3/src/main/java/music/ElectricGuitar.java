package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super.nameOfInstrument = "Electric Guitar";
    super.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    super.nameOfInstrument = "Electric Guitar";
    super.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println(nameOfInstrument + " has " + numberOfStrings + " strings with " + sound());
  }
}
