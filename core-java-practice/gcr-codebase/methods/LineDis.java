import java.util.*;

public class LineDis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Input points
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// Distance
		double distance = findDistance(x1, y1, x2, y2);
		System.out.println("Euclidean Distance = " + distance);

		// Line equation
		double[] line = findLineEquation(x1, y1, x2, y2);
		System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);

		input.close();
	}

	// b. Method to find Euclidean distance
	public static double findDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	// c. Method to find slope and y-intercept
	// Returns array: index 0 -> slope(m), index 1 -> intercept(b)
	public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

		double[] result = new double[2];

		double m = (y2 - y1) / (x2 - x1); // slope
		double b = y1 - m * x1; // y-intercept

		result[0] = m;
		result[1] = b;

		return result;
	}
}
