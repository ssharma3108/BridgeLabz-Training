import java.util.Scanner;

public class MultiplesUsingWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input
    int n = sc.nextInt();

    // check for valid input
    if (n > 0 && n < 100) {

      int counter = 100;

      while (counter >= 1) {
        if (counter % n == 0) {
          System.out.println(counter);
        }
        counter--;
      }

    } else {
      System.out.println("Please enter a valid positive number in the given range");
    }
  }
}