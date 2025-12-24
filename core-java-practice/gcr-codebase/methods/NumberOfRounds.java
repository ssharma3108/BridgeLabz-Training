import java.util.Scanner;

public class NumberOfRounds {

  // calculate the number of rounds
  static void numberOfRounds(int a, int b, int c) {
    int result = 5000 / (a + b + c);

    System.out.println(result);
  }

  // main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    numberOfRounds(a, b, c);
  }
}
