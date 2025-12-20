import java.util.Scanner;

public class PrimeOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();
    boolean isPrime = true;

    if (number <= 1) {
      isPrime = false;
    } else {
      // check divisibility from 2 to number-1
      for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    System.out.println("The given number is " + isPrime + " prime");

  }

}
