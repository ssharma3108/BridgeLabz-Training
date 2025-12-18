import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    float number1 = sc.nextFloat();
    float number2 = sc.nextFloat();

    // addition
    float addition = number1 + number2;

    // subtraction
    float subtraction = number1 - number2;

    // multiplication
    float multiplication = number1 * number2;

    // division
    float division = number1 / number2;

    // now print the result
    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and "
        + number2 + " is " + addition + " , " + subtraction + " , " + multiplication + " and " + division);

  }

}
