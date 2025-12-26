import java.util.*;

public class QuaAndRem {

  static void quaAndRem(int number1, int number2) {

    // now find the quotient
    int quotient = number1 / number2;

    // now find the remainder
    int remainder = number1 % number2;

    // print the result
    System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + " of two number "
        + number1 + " and " + number2);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // take two number input from the user
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();

    quaAndRem(number1, number2);

  }

}
