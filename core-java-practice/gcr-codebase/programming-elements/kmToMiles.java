import java.util.Scanner;

public class kmToMiles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double value = sc.nextInt();

    // now convert the given km value to miles
    double result = value * 0.621371;

    // now print the result
    System.out.println("The result after converting value from Km to Miles is ------->" + result);
  }

}
