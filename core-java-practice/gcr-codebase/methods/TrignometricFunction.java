import java.util.Scanner;

public class TrignometricFunction {
  public static double[] calculateTrigonometricFunctions(double angle) {
    // Convert angle from degrees to radians
    double radians = Math.toRadians(angle);

    // Calculate sine, cosine, and tangent
    double sine = Math.sin(radians);
    double cosine = Math.cos(radians);
    double tangent = Math.tan(radians);

    // Return results in an array
    return new double[] { sine, cosine, tangent };
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Ask user to enter an angle in degrees
    System.out.print("Enter angle in degrees: ");
    double angle = sc.nextDouble();

    // Call method to calculate trigonometric values
    double[] results = calculateTrigonometricFunctions(angle);

    // Display the results
    System.out.println("Sine: " + results[0]);
    System.out.println("Cosine: " + results[1]);
    System.out.println("Tangent: " + results[2]);

    sc.close(); // Close scanner to free resources
  }
}