import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumOfNumbers() {
    ArrayList<Integer> tempArray = new ArrayList();
    Sum sum = new Sum();

    for (int i = 1; i <= 3; i++) {
      tempArray.add(i);
    }

    int result = 6;

    assertEquals(result, sum.sumOfNumbers(tempArray));
  }

//  @Test
//  public void sumOfNumbers() {
//
//  }
}
