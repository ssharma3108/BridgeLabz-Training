import java.util.*;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking string from the user
    String str = sc.next();
    String s = "";

    // run a reverse loop
    for (int i = str.length() - 1; i >= 0; i++) {
      s += str.charAt(i);
    }

    // check whether both are equal or not
    System.out.println(s.equals(str));

  }
}
