import java.util.Scanner;

public class Bmi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double weight = sc.nextInt();
    double height = sc.nextInt();

    // now calculate the bmi
    double result = weight / (height * weight);

    System.out.println("The BMI accourding to given data is " + result);
  }

}
