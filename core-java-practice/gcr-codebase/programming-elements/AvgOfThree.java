import java.util.Scanner;

public class AvgOfThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // now calculate the avg of the given numbers
    int result = (a + b + c) / 3;

    System.out.println("The Avg of given three number is ------->" + result);

  }

}
