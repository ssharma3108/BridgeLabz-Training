import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    String str = sc.next();

    // by using stringbuilder we can easily reverse a string
    StringBuilder s = new StringBuilder(str);

    System.out.println(s.reverse());

  }
}
