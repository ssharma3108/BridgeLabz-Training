import java.util.*;

public class FlipKey {

  public String cleanAndInvert(String s) {

    if (s == null || s.length() <= 6) {
      System.out.print("Length of the input is less than 6.");
      return "";
    }

    String regex = ".*[0-9\\s].*";

    if (s.matches(regex)) {
      System.out.print("Invalid Input!!");
      return "";
    }

    s = s.toLowerCase();

    String result = "";

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      int ascii = ch;

      if (ascii % 2 != 0) {
        result += ch;
      }
    }

    String reverse = "";

    for (int i = result.length() - 1; i >= 0; i--) {
      reverse += result.charAt(i);
    }

    String f = "";

    for (int i = 0; i < reverse.length(); i++) {
      char ch = reverse.charAt(i);

      if (i % 2 == 0) {
        f += Character.toUpperCase(ch);
      } else {
        f += ch;
      }
    }

    return f;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    FlipKey obj = new FlipKey();
    String result = obj.cleanAndInvert(str);

    System.out.println(result);
  }
}
