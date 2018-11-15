package wsw04d4;

public class Power {
  public static void main(String[] args) {
    int base = 2;
    int powerN = 5;
    System.out.println(recursion(base, powerN));
  }

  public static int recursion(int base, int powerN) {
    if (powerN == 0) {
      return 1;
    } else
      return base * recursion(base, powerN - 1);
  }
}
