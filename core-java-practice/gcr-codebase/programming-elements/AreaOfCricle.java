import java.util.Scanner;

public class AreaOfCricle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt(); // taking input radius

    // now calculate the result using 3.14*r*r
    double result = 3.14 * r * r;

    System.out.println("The area of circle is --->" + result);

  }

}
