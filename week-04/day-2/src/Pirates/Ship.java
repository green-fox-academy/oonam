package Pirates;

import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> shipCrew = new ArrayList<>();
  int captainIndex = 0;

  void fillship() {
    int headcount = 5 + (int)(Math.random() * 26);

    for (int i = 1; i <= headcount; i++) {
      shipCrew.add(new Pirate());
    }

    captainIndex = (int)(Math.random() * headcount);
    shipCrew.get(captainIndex).isCaptain = true;
  }
}
