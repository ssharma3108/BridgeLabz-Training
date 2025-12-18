import java.util.Scanner;

public class CmToInchFeet {
  public static void main(String[] args) {
    // taking input from the user
    Scanner sc = new Scanner(System.in);
    double cm = sc.nextDouble();

    // convert to inch
    double inches = cm / 2.54;

    // convert to feet
    double feet = cm / 30.48;

    // now print the output after conversion
    System.out.println(" Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);

  }

}
