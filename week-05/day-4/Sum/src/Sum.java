import java.util.ArrayList;

public class Sum {
  ArrayList<Integer> sumArray = new ArrayList();

  public int sumOfNumbers(ArrayList<Integer> sumArray) {
    int temp = 0;

    for (int element : sumArray) {
      temp += element;
    }

    return temp;
  }
}
