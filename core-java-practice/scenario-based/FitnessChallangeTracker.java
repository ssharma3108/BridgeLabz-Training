import java.util.Scanner;

public class FitnessChallangeTracker {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int totalPushUps = 0;
    int activeDays = 0;

    // array to store the number of days
    String[] days = {
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    };

    // running a loop for get the puship data
    for (int i = 0; i < days.length; i++) {

      System.out.print("Enter push-ups for " + days[i] + ": ");
      int pushUps = sc.nextInt();

      // skip rest days
      if (pushUps == 0) {
        System.out.println("Rest day skipped.");
        continue;
      }

      totalPushUps += pushUps;
      activeDays++;
    }

    // calcluate the pushup

    System.out.println("\nTotal push-ups (excluding rest days): " + totalPushUps);

    if (activeDays > 0) {
      double average = (double) totalPushUps / activeDays;
      System.out.println("Average push-ups per active day: " + average);
    } else {
      System.out.println("No active days recorded.");
    }

    sc.close();
  }
}
