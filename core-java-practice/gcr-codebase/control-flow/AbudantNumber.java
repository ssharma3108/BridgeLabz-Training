import java.util.Scanner;

public class AbudantNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int n = sc.nextInt();
    int sum = 0;

    // loop for getting divisors
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    if (sum > n) {
      System.err.println("Abundant Number");
    } else {
      System.out.println("NOT A Abundant Number");
    }
  }

}
