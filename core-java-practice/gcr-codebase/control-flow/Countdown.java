import java.util.Scanner;

public class Countdown {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();

    // decrease the counter until it goes to 0
    while (number > -1) {
      System.out.println(number);
      number--;
    }
  }
}
