import java.util.ArrayList;
import java.util.List;

public class Garden {

  ArrayList<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlants(Plant... plantnames) {
    for (Plant plant : plantnames) {
      plants.add(plant);
    }
  }

  public void getStatus() {
    for (Plant plant : plants) {
      if (plant.getWaterAmount() < plant.getMinWaterLevel()) {
        System.out.println("The " + plant.getColor() + " " + plant.getType() + " needs water. Waterlevel: " + plant.getWaterAmount());
      } else {
        System.out.println("The " + plant.getColor() + " " + plant.getType() + " doesn't need water. Waterlevel: " + plant.getWaterAmount());
      }
    }
  }

  public void watering(int fullAmountOfWatering) {
    List<Plant> plantsWhichNeedWater = new ArrayList<>();

    for (Plant plant : plants) {
      if (plant.getWaterAmount() < plant.getMinWaterLevel()) {
        plantsWhichNeedWater.add(plant);
      }
    }

    int waterPerPlant = fullAmountOfWatering / plantsWhichNeedWater.size();
    double currentWaterLevel;

    for (Plant plant : plantsWhichNeedWater) {
      currentWaterLevel = plant.getWaterAmount() + (waterPerPlant * plant.getWaterAbsorb());
      plant.setWaterAmount(currentWaterLevel);
    }
  }
}
