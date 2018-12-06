package CharSequence;

public class Main {

  public static void main(String[] args) {
    System.out.println("The example word: example");

    Gnirts g = new Gnirts("example");
    System.out.println("The second letter from the last: " + g.charAt(1));
// should print out: l

    Shifter s = new Shifter("example", 2);
    System.out.println("The third letter from the first: " + s.charAt(0));
// should print out: a
  }
}
