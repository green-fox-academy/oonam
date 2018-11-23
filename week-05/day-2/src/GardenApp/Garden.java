package GardenApp;

import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> listOfPlants;

  Garden(ArrayList<Plant> listOfPlants) {
    this.listOfPlants = listOfPlants;
  }

  void getStatus() {
    for (Plant plant : listOfPlants) {
      if (plant.minWaterAmount > plant.waterAmount) {
        System.out.println("The " + plant.color + " " + plant.type + " needs water! Waterlevel: " + plant.waterAmount);
      } else {
        System.out.println("The " + plant.color + " " + plant.type + " doesn't need water. Waterlevel: " + plant.waterAmount);
      }
    }
  }

  void wateringTheGarden(double fullCan) {
    double numberOfPlantWhichNeedsWater = 0;

    for (Plant plant : listOfPlants) {
      if (plant.waterAmount < plant.minWaterAmount) {
        numberOfPlantWhichNeedsWater++;
      }
    }

    double waterPerPlants = fullCan / numberOfPlantWhichNeedsWater;

    for (Plant plant : listOfPlants) {
      if (plant.waterAmount < plant.minWaterAmount) {
        plant.waterAmount += (waterPerPlants * plant.waterAbsorb);
      }
    }
  }
}
