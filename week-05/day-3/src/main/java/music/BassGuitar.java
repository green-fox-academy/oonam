package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super.nameOfInstrument = "Bass Guitar";
    super.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println(nameOfInstrument + " has " + numberOfStrings + " strings with " + sound());
  }
}
