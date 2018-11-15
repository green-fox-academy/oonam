package wsw04d4;

public class String1 {
  public static void main(String[] args) {
    String string = "Given x xtring, xompute xecursively (no loops)";
    char oldChar = 'x';
    char newChar = 'y';

    System.out.println(charChanger(string, oldChar, newChar));
  }

  public static String charChanger(String string, char oldChar, char newChar) {
    char temp;
    if (string.length() < 1) {
      return string;
    } else {
      if (oldChar == string.charAt(0)) {
        temp = newChar;
      } else {
        temp = string.charAt(0);
      }
      return temp + charChanger(string.substring(1), oldChar, newChar);
    }
  }
}
