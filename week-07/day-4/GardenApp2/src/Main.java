import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Garden garden1 = new Garden();

        Plant flower1 = new Flower("yellow");
        Plant flower2 = new Flower("blue");
        Plant tree3 = new Tree("purple");
        Plant tree4 = new Tree("orange");

        garden1.addPlants(flower1, flower2, tree3, tree4);

        garden1.getStatus();
        System.out.print(System.lineSeparator());
        garden1.watering(40);
        garden1.getStatus();
        System.out.print(System.lineSeparator());
        garden1.watering(70);
        garden1.getStatus();

    }
}
