import java.util.*;

public class CompareStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input string
    String a = sc.next();
    String b = sc.next();

    boolean isEqual = true;

    // print whether these are equal or not

    // check for base condition
    if (a.length() != b.length()) {
      isEqual = false;

    } else {

      for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) != b.charAt(i)) {
          isEqual = false;
          break;
        }
      }
    }
    // now check and print the output
    if (isEqual) {
      System.out.println("The given string are equal");
    } else {
      System.out.println("The given string are not equal");
    }

  }
}
