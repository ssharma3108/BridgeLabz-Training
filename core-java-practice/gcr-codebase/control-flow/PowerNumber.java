import java.util.Scanner;

public class PowerNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();
    int power = sc.nextInt();

    // check for positive then calculate it using loop
    if (number > 0 && power >= 0) {
      int result = 1;

      for (int i = 1; i <= power; i++) {
        result = result * number;
      }
      System.out.println("The power result for the given number is " + result);
    } else {
      System.out.println("The Either the power or the number not in positive");
    }
  }
}
