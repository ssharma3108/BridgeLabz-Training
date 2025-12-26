import java.util.Scanner;

public class SmallestAndLargest {

  // Method to find and print smallest and largest among three numbers
  static void findSmallestAndGreatest(int number1, int number2, int number3) {
    // Assume first number is both smallest and largest initially
    int smallest = number1;
    int largest = number1;

    // Compare with second number
    if (number2 < smallest) {
      smallest = number2;
    }
    if (number2 > largest) {
      largest = number2;
    }

    // Compare with third number
    if (number3 < smallest) {
      smallest = number3;
    }
    if (number3 > largest) {
      largest = number3;
    }

    // Print results
    System.out.println("Smallest number: " + smallest);
    System.out.println("Largest number: " + largest);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking input from the user
    System.out.println("Enter three numbers:");
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();

    // Call the method to find smallest and largest
    findSmallestAndGreatest(number1, number2, number3);

    sc.close(); // Close scanner to avoid resource leak
  }
}