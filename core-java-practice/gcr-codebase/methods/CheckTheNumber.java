import java.util.*;

public class CheckTheNumber {

  static void CheckNumber(int n) {
    // check whether the given number is positive,negative or zero
    if (n > 0) {
      System.err.println("Positive");
    } else if (n == 0) {
      System.out.println("Zero");
    }
    System.out.println("Negative");
  }

  // main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    CheckNumber(n);
  }
}
