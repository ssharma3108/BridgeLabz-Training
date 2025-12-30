import java.util.Scanner;

public class LineComparison {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Start the program
    System.out.println("Welcome to Line Comparison Computation Program on Master Branch\n");

    // UC 1: Calculate Length of Line 1
    System.out.print("Enter the value of x1 -: ");
    int x1 = sc.nextInt();

    System.out.print("Enter the value of x2 -: ");
    int x2 = sc.nextInt();

    System.out.print("Enter the value of y1 -: ");
    int y1 = sc.nextInt();

    System.out.print("Enter the value of y2 -: ");
    int y2 = sc.nextInt();

    double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    // UC 1: Calculate Length of Line 2
    System.out.print("Enter the value of x3 -: ");
    int x3 = sc.nextInt();

    System.out.print("Enter the value of x4 -: ");
    int x4 = sc.nextInt();

    System.out.print("Enter the value of y3 -: ");
    int y3 = sc.nextInt();

    System.out.print("Enter the value of y4 -: ");
    int y4 = sc.nextInt();

    double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

    // UC 2: Check equality using equals()
    Double lineOne = length1;
    Double lineTwo = length2;

    if (lineOne.equals(lineTwo)) {
      System.out.println("Both lines are equal.");
    } else {
      System.out.println("Both lines are not equal.");
    }

    // UC 3: Compare two lines using compareTo()
    int comparison = lineOne.compareTo(lineTwo);

    if (comparison > 0) {
      System.out.println("Line 1 is greater.");
    } else if (comparison < 0) {
      System.out.println("Line 2 is greater.");
    } else {
      System.out.println("Both lines are equal.");
    }

    System.out.println("Thank You.");
  }
}
