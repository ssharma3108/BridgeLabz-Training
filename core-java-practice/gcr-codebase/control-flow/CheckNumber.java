import java.util.Scanner;

public class CheckNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();

    // check whether the given number is positive,negative or zero
    if (number > 0) {
      System.err.println("Positive");
    } else if (number == 0) {
      System.out.println("Zero");
    } else {
      System.out.println("Negative");
    }

  }

}
