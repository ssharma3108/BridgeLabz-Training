import java.util.*;

public class SpringSeason {

  static void season(int day, int month) {
    // checking for the spring season
    if ((month == 3 && day >= 20) ||
        (month == 4) ||
        (month == 5) ||
        (month == 6 && day <= 20)) {
      System.out.println("Its a Spring Season");
    }
    System.out.println("Not a Spring Season");
  }

  // main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int day = sc.nextInt();
    int month = sc.nextInt();

    season(day, month);

  }
}