import java.util.*;

public class SumOfNumbersUsingInfiniteLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from user and a sum name variale that store value
    double number = sc.nextDouble();
    double sum = 0;

    // Take the user entry and check if the user entered 0 or a negative number to
    // break the loop using break;

    while (true) {
      if (number > 0) {
        sum += number;
        System.out.print("Enter the number again -:");
        number = sc.nextInt();
      } else {
        break;
      }
    }
    System.out.println(sum);

  }

}
