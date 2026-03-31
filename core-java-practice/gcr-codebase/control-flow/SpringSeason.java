import java.util.Scanner;

public class SpringSeason {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int day = sc.nextInt();
    int month = sc.nextInt();

    // checking for the spring season
    if ((month == 3 && day >= 20) ||
        (month == 4) ||
        (month == 5) ||
        (month == 6 && day <= 20)) {
      System.out.println("Its a Spring Season");
    } else {
      System.out.println("Not a Spring Season");
    }
  }
}