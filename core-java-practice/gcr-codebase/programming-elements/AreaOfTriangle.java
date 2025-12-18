import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    double base = sc.nextDouble();
    double height = sc.nextDouble();

    // calculate the are in inches
    double area = 0.5 * base * height;

    // calculate in square cm
    double areaCm = area * 6.4516;

    // print the result
    System.out.println(" Your Height in cm is " + height + " while in feet is " + areaCm + " and inches is " + area);

  }

}
