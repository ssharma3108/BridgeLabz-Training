import java.util.Scanner;

public class CelToFah {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cel = sc.nextInt(); // taking input from the user

    int result = (cel * 9 / 5) + 32; // now calculate the temperature using formula
    System.out.println("The temperature after converting cel to fah is ---->" + result);

  }

}
