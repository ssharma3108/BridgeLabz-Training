import java.util.Scanner;

public class YardAndMiles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from user
    double feet = sc.nextDouble();

    // convert to yards
    double yards = feet / 3;
    // convert to miles
    double miles = feet / 5280;

    // now print the result
    System.out.println("Your Output in yards is " + yards + " and in miles is " + miles);

  }

}
