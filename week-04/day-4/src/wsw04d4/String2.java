package wsw04d4;

public class String2 {
  public static void main(String[] args) {
    String string = "Given x xtring, xompute xecursively (no loops)";
    char oldChar = 'x';

    System.out.println(charChanger(string, oldChar));
  }

  public static String charChanger(String string, char oldChar) {
    char temp;
    if (string.length() < 1) {
      return string;
    } else {
      if (oldChar == string.charAt(0)) {
        return charChanger(string.substring(1), oldChar);
      } else {
        temp = string.charAt(0);
      }
      return temp + charChanger(string.substring(1), oldChar);
    }
  }
}
