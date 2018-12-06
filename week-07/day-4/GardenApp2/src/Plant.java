import java.util.ArrayList;

public class Plant {

  private String color;
  private String type;
  private double waterAmount;
  private double waterAbsorb;
  private int minWaterLevel;

  public Plant(String color, String type, int waterAmount, double waterAbsorb, int minWaterLevel) {
    this.color = color;
    this.type = type;
    this.waterAmount = waterAmount;
    this.waterAbsorb = waterAbsorb;
    this.minWaterLevel = minWaterLevel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount;
  }

  public double getWaterAbsorb() {
    return waterAbsorb;
  }

  public void setWaterAbsorb(double waterAbsorb) {
    this.waterAbsorb = waterAbsorb;
  }

  public int getMinWaterLevel() {
    return minWaterLevel;
  }

  public void setMinWaterLevel(int minWaterLevel) {
    this.minWaterLevel = minWaterLevel;
  }
}
