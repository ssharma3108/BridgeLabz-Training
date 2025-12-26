import java.util.*;

public class ToggleCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input
    String str = sc.next();
    String result = "";

    // running loop to convert lower to upper and upper to lower
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLowerCase(str.charAt(i))) {
        result += Character.toUpperCase(str.charAt(i));
      } else {
        result += Character.toLowerCase(str.charAt(i));
      }
    }
    System.out.println(result);
  }
}
