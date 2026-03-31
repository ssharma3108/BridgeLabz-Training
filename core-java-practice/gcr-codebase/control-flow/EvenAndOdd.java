import java.util.Scanner;

public class EvenAndOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from user
    int n = sc.nextInt();

    // run for loop for check for even and odd and then print the output
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println("Even Number " + i);
      } else {
        System.out.println("Odd Number " + i);
      }
    }

  }

}
