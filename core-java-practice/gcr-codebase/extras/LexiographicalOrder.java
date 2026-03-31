import java.util.*;

public class LexiographicalOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    String str1 = sc.next();
    String str2 = sc.next();

    int result = str1.compareTo(str2);

    if (result == 0) {
      System.out.println("Strings are equal.");
    } else if (result < 0) {
      System.out.println(str1 + " comes before " + str2);
    } else {
      System.out.println(str1 + " comes after " + str2);
    }
  }
}