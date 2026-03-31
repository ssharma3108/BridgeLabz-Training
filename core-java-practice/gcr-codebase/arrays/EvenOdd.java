import java.util.*;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();
    String[] arr = new String[number]; // store output whether the number is even or odd

    if (number <= 0) {
      System.out.println("The given number is not a natural number");
    }

    // now check for the even odd
    for (int i = 1; i <= number; i++) {
      if (i % 2 == 0) {
        arr[i - 1] = "even";
      } else {
        arr[i - 1] = "odd";
      }
    }

    // now print the output
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
  }
}
