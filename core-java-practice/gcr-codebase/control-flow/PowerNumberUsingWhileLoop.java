import java.util.Scanner;

public class PowerNumberUsingWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input
    int number = sc.nextInt();

    int power = sc.nextInt();

    int result = 1;
    int counter = 0;

    // now calculate using while loop
    while (counter < power) {
      result = result * number;
      counter++;
    }

    System.out.println("The result of the power number is " + result);

  }

}
