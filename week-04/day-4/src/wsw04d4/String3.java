package wsw04d4;

public class String3 {
  public static void main(String[] args) {
    String string = "Given x xtring, xompute xecursively (no loops)";

    System.out.println(charChanger(string));
  }

  public static String charChanger(String string) {
    char temp;
    if (string.length() < 1) {
      return string;
    }
    temp = string.charAt(0);
    return temp + "*" + charChanger(string.substring(1));
  }
}
