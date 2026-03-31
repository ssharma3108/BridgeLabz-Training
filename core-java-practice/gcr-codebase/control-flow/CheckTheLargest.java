import java.util.Scanner;

public class CheckTheLargest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();

    // checking the largest number
    if (number1 < number2 && number2 > number3) {
      System.out.println("Number 2 is the Largest Number");
    } else if (number1 < number2 && number2 < number3) {
      System.out.println("Number 3 is the alargest Number");
    } else {
      System.out.println("Number 1 is the Largest Number.");
    }
  }
}
