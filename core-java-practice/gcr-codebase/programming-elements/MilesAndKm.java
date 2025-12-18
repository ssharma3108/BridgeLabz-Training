import java.util.Scanner;

public class MilesAndKm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double km = sc.nextDouble();

    // calculate km in miles
    double miles = km / 1.6;

    System.out.println("The distance " + km + " km in miles is " + miles);

  }

}
