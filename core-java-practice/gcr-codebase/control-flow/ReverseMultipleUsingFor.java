import java.util.Scanner;

public class ReverseMultipleUsingFor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input form the user
    int n = sc.nextInt();

    // run a reverse loop and also check whether the given numeber is less than 100
    if (n < 100 && n > 0) {
      for (int i = 100; i >= 1; i--) {
        if (i % n == 0) {
          System.out.println(i);
        }
      }
    } else {
      System.out.println("The number is not in range between 1 to 100");
    }

  }
}
