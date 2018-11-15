package wsw04d4;

public class Bunny1 {
  public static void main(String[] args) {
    int bunnies = 150;
    System.out.println(bunnyEars(bunnies));
  }

  public static int bunnyEars(int bunnies) {
    int ears = 2;
    if (bunnies == 1) {
      return ears;
    } else
      return ears + bunnyEars(bunnies - 1);
  }
}
