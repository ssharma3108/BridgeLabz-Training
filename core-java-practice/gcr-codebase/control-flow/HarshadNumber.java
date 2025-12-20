import java.util.Scanner;

public class HarshadNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input
    int number = sc.nextInt();
    int result = 0;

    // Harshad number is an integer which is divisible by the sum of its digits.
    int n = number;
    while (n != 0) {
      result = result + n % 10;
      n = n / 10;
    }

    if (number % result == 0) {
      System.out.println("Harshad Number");
    } else {
      System.out.println("Not a Harshad Number");
    }

  }
}
