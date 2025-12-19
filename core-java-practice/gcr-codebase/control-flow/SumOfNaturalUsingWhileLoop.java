import java.util.Scanner;

public class SumOfNaturalUsingWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();

    // checking whether the given number is natural or not
    while (true) {
      if (number >= 1) { // if it is natural
        int result = number * (number + 1) / 2; // get sum
        System.err.println("The sum of " + number + " natural numbers is " + result); // print the number and sum
        break;

      } else {
        System.err.println("The number " + number + " is not a natural number."); // if not natural number
        break;
      }
    }
  }
}