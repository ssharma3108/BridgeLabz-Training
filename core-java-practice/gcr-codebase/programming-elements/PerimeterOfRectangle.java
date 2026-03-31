import java.util.Scanner;

public class PerimeterOfRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double length = sc.nextInt();
    double width = sc.nextInt();

    // calculate the perimeter using formula 2*(length+width)
    double result = 2 * (length + width);

    System.out.println(result);

  }

}
