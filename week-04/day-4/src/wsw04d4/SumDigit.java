package wsw04d4;

public class SumDigit {
  public static void main(String[] args) {
    int number = 2468;
    System.out.println(recursion(number));
  }

  public static int recursion(int number) {
    if (number == 0) {
      return 0;
    } else
      return (number % 10) + recursion(number / 10);
  }
}
