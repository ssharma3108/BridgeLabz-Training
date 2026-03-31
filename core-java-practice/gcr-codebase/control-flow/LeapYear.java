import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    System.out.print("Enter the year -:");
    int year = sc.nextInt();

    // match the condition that are suitable for a leap year
    if (year >= 1582) {
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println("The given year " + year + " is a leap year");
      }
    } else {
      System.out.println("Please enter the year in the given range");
    }
  }

}
