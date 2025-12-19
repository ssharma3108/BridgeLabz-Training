import java.util.*;

public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from user and a sum name variale that store value
    double number = sc.nextDouble();
    double sum = 0;

    // The loop will continue till the user enters zero and outside the loop display
    // the total value
    while (number != 0) {
      sum += number;
      System.out.print("Enter the number again -:");
      number = sc.nextInt();
    }
    System.out.println(sum);

  }

}
