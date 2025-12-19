import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // taking input
    int number = sc.nextInt();

    int greatestFactor = 1;
    int counter = number - 1;

    // while loop
    while (counter >= 1) {
      if (number % counter == 0) {
        greatestFactor = counter;
        break;
      }
      counter--;
    }

    System.out.println("The greatest factor for the given number is " + greatestFactor);
  }
}
