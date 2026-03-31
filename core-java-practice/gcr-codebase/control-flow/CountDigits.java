import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();
    int count = 0;

    // handle zero case
    if (number == 0) {
      count = 1;
    } else {
      // loop to count digits
      while (number != 0) {
        number = number / 10; // remove last digit
        count++;
      }
    }

    System.err.println(count);

  }
}
