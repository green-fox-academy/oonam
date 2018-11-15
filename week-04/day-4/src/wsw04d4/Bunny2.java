package wsw04d4;

public class Bunny2 {
  public static void main(String[] args) {
    int bunnies = 10;
    System.out.println(bunnyEars2(bunnies));
  }

  public static int bunnyEars2(int bunnies) {
    int ears = 2;
    if (bunnies == 1) {
      return ears;
    } else {
      if (bunnies % 2 == 0) {
        return ears + 1 + bunnyEars2(bunnies - 1);
      } else {
        return ears + bunnyEars2(bunnies - 1);
      }
    }
  }
}
