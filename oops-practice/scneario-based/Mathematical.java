import java.util.*;

public class Mathematical {

  // factorial
  static int calculateFactorial(int number) {
    if (number == 0 || number == 1) {
      return 1;
    }
    return number * calculateFactorial(number - 1);
  }

  // prime check
  static void checkPrime(int number) {
    boolean isPrime = true;
    if (number <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i * i < number; i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      System.out.println("The given number is prime");
    } else {
      System.out.println("Not a prime number");
    }
  }

  // gcd checker
  static void gcdChecker(int a, int b) {
    int originalA = a;
    int originalB = b;

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    System.out.println("The GCD of " + originalA + " and " + originalB + " is: " + a);
  }

  // fibonacci checker
  static int fibonacci(int number) {
    if (number == 0) {
      return 0;
    } else if (number == 1) {
      return 1;
    }

    return fibonacci(number - 1) + fibonacci(number - 2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print(
          "Enter the choice to perform operation -: 1 for factorial | 2 for prime check | 3 for GCD check | 4 for fibonacci check | 5 for exit -: ");
      int choice = sc.nextInt();
      if (choice == 1) {
        int number = sc.nextInt();
        System.out.println("The factorial of the given number is -: " + calculateFactorial(number));
      } else if (choice == 2) {
        int number = sc.nextInt();
        checkPrime(number);
      } else if (choice == 3) {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        gcdChecker(num2, num2);
      } else if (choice == 4) {
        int number = sc.nextInt();
        System.out.println("The fibonacci of the given number is -: " + fibonacci(number));
      } else if (choice == 5) {
        System.out.println("Thanks for visiting........");
        break;
      }
    }
  }
}
