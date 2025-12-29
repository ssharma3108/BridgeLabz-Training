import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // guess the number
    System.out.println("User thinking for a number between 1 to 100");

    System.out.println("Let's Start the Game.......");

    // taking random input...........
    Random r = new Random();
    int number = r.nextInt(100) + 1;

    // taking random guess........
    while (true) {

      System.out.println("The number guess by Computer is -:" + number);
      System.out.print("Is the guess High, Low, or Correct?");
      String userInput = sc.next();
      if (userInput.equals("high")) {
        // thing for low number
        System.out.println("Computer will guess a lower number.");
        number = r.nextInt(number) + 1;
      } else if (userInput.equals("low")) {
        // thinking for a higher number
        System.out.println("Computer will guess a higher number.");
        number = r.nextInt(100) + number;
      } else {
        System.out.println("Congratulation , you guess it correctly .............");
        break;
      }
    }

  }

}