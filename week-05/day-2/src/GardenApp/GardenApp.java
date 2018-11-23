package GardenApp;

import java.util.ArrayList;

public class GardenApp {
  public static void main(String[] args) {

    ArrayList<Plant> plantsOfGarden = new ArrayList<>();

    Garden firstGarden = new Garden(plantsOfGarden);

    firstGarden.listOfPlants.add(new Flower("yellow", "flower"));
    firstGarden.listOfPlants.add(new Flower("blue", "flower"));
    firstGarden.listOfPlants.add(new Tree("purple", "tree"));
    firstGarden.listOfPlants.add(new Tree("orange", "tree"));

    firstGarden.getStatus();
    firstGarden.wateringTheGarden(40);
    System.out.print(System.lineSeparator());

    firstGarden.getStatus();
    firstGarden.wateringTheGarden(70);
    System.out.print(System.lineSeparator());

    firstGarden.getStatus();
  }
}
