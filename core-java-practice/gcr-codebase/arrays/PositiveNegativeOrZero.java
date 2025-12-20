import java.util.*;

public class PositiveNegativeOrZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int[] number = new int[5];

    // check whether the given number is positive,negative or zero
    for (int i = 0; i < number.length; i++) {
      if (number[i] > 0) {
        System.err.println("Positive");
      } else if (number[i] == 0) {
        System.out.println("Zero");
      } else {
        System.out.println("Negative");
      }

    }

  }

}
