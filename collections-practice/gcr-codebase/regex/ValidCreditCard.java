import java.util.*;

public class ValidCreditCard {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    String s = Long.toString(n);

    String visa = "^[4][0-9]{16}";
    String master = "^[5][0-9]{16}";

    if (s.matches(master)) {
      System.out.println("This is Master Card");
    } else if (s.matches(visa)) {
      System.out.println("This is Visa card");
    } else {
      System.out.println("Invalid Card");
    }

  }
}