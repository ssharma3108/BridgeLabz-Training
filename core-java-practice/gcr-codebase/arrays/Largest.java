import java.util.Scanner;

public class Largest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a n: ");
    int n = sc.nextInt();

    // Initial array size

    int maxDigit = 10;
    int[] digit = new int[maxDigit];

    int index = 0;

    // Store digit dynamically
    while (n != 0) {

      // If array is full, increase size by 10
      if (index == maxDigit) {
        maxDigit = maxDigit + 10;

        int[] temp = new int[maxDigit];

        // Copy old digit into new array
        for (int i = 0; i < digit.length; i++) {

          temp[i] = digit[i];
        }

        digit = temp;
      }

      // Extract and store digit
      digit[index] = n % 10;

      n = n / 10;
      index++;
    }

    // Variables for largest and second largest
    int largest = 0;

    int secondLargest = 0;

    // Find largest and second largest digit

    for (int i = 0; i < index; i++) {

      if (digit[i] > largest) {

        secondLargest = largest;

        largest = digit[i];

      } else if (digit[i] > secondLargest && digit[i] != largest) {

        secondLargest = digit[i];
      }
    }

    // Display result

    System.out.println("\nLargest digit: " + largest);

    System.out.println("Second largest digit: " + secondLargest);

    sc.close();
  }
}