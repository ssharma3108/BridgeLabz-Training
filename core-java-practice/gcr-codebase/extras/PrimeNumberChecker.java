import java.util.Scanner;

public class PrimeNumberChecker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isPrime = true;

    // checking whether the given number is prime or not ........
    if (n < 2) {
      isPrime = false;
    } else {
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    System.out.println(isPrime);

  }
}
