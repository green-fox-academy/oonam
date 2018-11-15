package wsw04d4;

public class NumberAdder {

  public static void main(String[] args) {
    int firstNumber = 1;
    int addTillN = 6;
    recursion(firstNumber, addTillN);
  }

  public static void recursion(int firstNumber, int addTillN) {
    System.out.println(firstNumber);
    if (firstNumber < addTillN) {
      recursion(firstNumber + 1, addTillN);
    }
  }
}
