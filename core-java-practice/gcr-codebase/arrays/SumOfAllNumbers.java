import java.util.*;

public class SumOfAllNumbers {
  public static void main(String[] args) {
    // taking input from the user
    Scanner sc = new Scanner(System.in);
    double[] number = new double[10];
    double total = 0.0;
    int index = 0;

    // now run the loop and print the output
    while (true) {
      System.out.print("Enter the number");
      double num = sc.nextInt();

      if (num <= 0) {
        break;
      }
      if (index == 10) {
        break;
      }

      // either store the value in the array
      number[index] = num;
      index++;
    }

    // now calculate the sum
    for (int i = 0; i < number.length; i++) {
      total += number[i];
    }

    System.out.println("The total sum is " + total);
  }

}
