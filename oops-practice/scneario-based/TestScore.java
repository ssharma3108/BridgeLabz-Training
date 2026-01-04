import java.util.*;

public class TestScore {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of students -: ");
    int n = sc.nextInt();

    int[] students = new int[n];
    int total = 0;

    // taking input from the user
    System.out.println("Enter the scores:");
    for (int i = 0; i < students.length; i++) {
      students[i] = sc.nextInt();

      // Check for negative input immediately
      if (students[i] < 0) {
        System.out.println("Invalid input detected. Scores must be non-negative.");
        return; // Use 'return' instead of 'break' to stop the whole program
      }
      total += students[i];
    }

    // Sort the array
    Arrays.sort(students);

    // average
    double average = (double) total / n;

    System.out.println("\nAverage Score: " + average);
    System.out.print("Scores Above Average: ");

    boolean foundAbove = false;
    for (int i = 0; i < students.length; i++) {
      if (students[i] > average) {
        System.out.print(students[i] + " ");
        foundAbove = true;
      }
    }

    // Print a message if no one is above average
    if (!foundAbove)
      System.out.print("None");

    System.out.println("\n\nHighest Score -: " + students[students.length - 1]);
    System.out.println("Lowest Score -: " + students[0]);
  }
}