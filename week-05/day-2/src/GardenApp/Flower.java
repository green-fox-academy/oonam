package GardenApp;

public class Flower extends Plant{

  Flower(String color, String type) {
    this.color = color;
    this.type = type;
    this.waterAmount = 0;
    this.waterAbsorb = 0.75;
    this.minWaterAmount = 5;
  }
}
