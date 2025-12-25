import java.util.*;

public class FitnessTracker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from user
    System.err.print("Enter the height (in meters) -:");
    double height = sc.nextDouble();

    System.err.print("Enter the Weight (in kg) -:");
    double weight = sc.nextDouble();

    // calcualte the bmi
    double bmi = weight / (height * height);

    System.out.printf("BMI -: %.2f%n", bmi);

    // Determine BMI category
    if (bmi < 18.5) {
      System.out.println("Category: Underweight");
    } else if (bmi >= 18.5 && bmi < 25) {
      System.out.println("Category: Normal");
    } else {
      System.out.println("Category: Overweight");
    }

  }
}
