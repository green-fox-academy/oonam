package wsw04d4;

public class Refactorio {
  public static void main(String[] args) {
    int number = 4;

    System.out.println(refactorio(number));
  }

  public static int refactorio(int number) {
    if (number == 0) {
      return 1;
    }
    return number * refactorio(number - 1);
  }
}
