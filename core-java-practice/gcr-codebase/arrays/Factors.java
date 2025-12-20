import java.util.*;

public class Factors {
  public static void main(String[] args) {
    // take input
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    // initial array size
    int maxFactor = 10;
    int[] factors = new int[maxFactor];
    int index = 0;

    // find factors
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {

        // if array is full, resize it
        if (index == maxFactor) {
          maxFactor = maxFactor * 2;
          int[] temp = new int[maxFactor];

          // copy old elements
          for (int j = 0; j < index; j++) {
            temp[j] = factors[j];
          }

          factors = temp;
        }

        // store factor
        factors[index] = i;
        index++;
      }
    }

    // display factors
    System.out.println("Factors of " + number + " are:");
    for (int i = 0; i < index; i++) {
      System.out.println(factors[i]);
    }
  }
}