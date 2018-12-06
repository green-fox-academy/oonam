package Pirates;

public class Pirate extends People implements Fightable {

  int alcoholLevel;
  String pet = "";
  boolean isCaptain;

  Pirate() {
    this.isCaptain = false;
    this.isAlive = true;
    this.isAwake = true;
    this.fightingPower = 3;
    this.alcoholLevel = 0;
    int petChance = 1 + (int)(Math.random() * 10);

    if (petChance > 9) {
      pet = "Parrot";
    } else if (petChance < 2) {
      pet = "Monkey";
    }
  }

  void drinkSomeRum() {
    this.alcoholLevel++;
  }

  void howsItGoingMate() {
    if (!this.isAlive) {
      dead();
    } else {
      if (alcoholLevel < 5) {
        System.out.println("Pour me anudder!");
        drinkSomeRum();
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.isAwake = false;
        this.alcoholLevel = 0;
      }
    }
  }

  @Override
  public void brawl() {
    System.out.println("brawl");
  }

  void dead() {
    System.out.println("He's dead.");
  }

  @Override
  public void die() {
    this.isAlive = false;
  }
}
