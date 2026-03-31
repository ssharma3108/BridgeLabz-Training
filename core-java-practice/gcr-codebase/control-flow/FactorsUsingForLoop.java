import java.util.Scanner;

public class FactorsUsingForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int n = sc.nextInt();

    // now check for factors using for loop
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println("The factors of the given number are -: " + i);
      }
    }
  }
}
