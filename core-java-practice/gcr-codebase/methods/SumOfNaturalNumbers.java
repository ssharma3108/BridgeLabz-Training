import java.util.Scanner;

public class SumOfNaturalNumbers {

  static void sumNatural(int number) {
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

  // main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();

    // call the method
    sumNatural(number);

  }
}
