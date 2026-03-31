import java.util.Scanner;

public class Factorial {

  // use recursion for find the factorial
  static int factRecursion(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factRecursion(n - 1);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(factRecursion(n));

  }
}
