package GardenApp;

public class Tree extends Plant{

  Tree(String color, String type) {
    this.color = color;
    this.type = type;
    this.waterAmount = 0;
    this.waterAbsorb = 0.4;
    this.minWaterAmount = 10;
  }
}
