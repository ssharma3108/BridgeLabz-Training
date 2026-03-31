import java.util.Scanner;

public class BmiOneDimentional {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    System.out.print("Enter number of persons: ");
    int n = sc.nextInt();
    // making 1 d array to store values
    double[] weight = new double[n];
    double[] height = new double[n];
    double[] bmi = new double[n];
    String[] status = new String[n];
    // run the loop to taking input details
    for (int i = 0; i < n; i++) {
      System.out.println("\nEnter details for Person " + (i + 1) + ":");

      System.out.print("Enter weight (kg): ");
      weight[i] = sc.nextDouble();
      while (weight[i] <= 0) {
        System.out.print("Invalid! Enter positive weight: ");
        weight[i] = sc.nextDouble();
      }

      System.out.print("Enter height (m): ");
      height[i] = sc.nextDouble();
      while (height[i] <= 0) {
        System.out.print("Invalid! Enter positive height: ");
        height[i] = sc.nextDouble();
      }

      bmi[i] = weight[i] / (height[i] * height[i]);
      if (bmi[i] <= 18.4)
        status[i] = "Underweight";
      else if (bmi[i] <= 24.9)
        status[i] = "Normal";
      else if (bmi[i] <= 39.9)
        status[i] = "Overweight";
      else
        status[i] = "Obese";
    }

    // after the calculation print the result
    System.out.println("\n--- BMI Report ---");
    for (int i = 0; i < n; i++) {
      System.out.printf("Person %d:\n", (i + 1));
      System.out.printf("  Weight: %.2f kg\n", weight[i]);
      System.out.printf("  Height: %.2f m\n", height[i]);
      System.out.printf("  BMI: %.2f\n", bmi[i]);
      System.out.println("  Status: " + status[i]);
      System.out.println();
    }
  }
}