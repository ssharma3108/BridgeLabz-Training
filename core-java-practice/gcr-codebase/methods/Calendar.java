
import java.util.*;

public class Calendar {

  // a. Month names array
  static String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
      "October", "November", "December" };

  // b. Days in month array
  static int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  // a. Get month name
  public static String getMonthName(int month) {
    return months[month];
  }

  // b. Leap year check
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  // b. Get number of days in month
  public static int getDaysInMonth(int month, int year) {
    if (month == 2 && isLeapYear(year)) {
      return 29;
    }
    return days[month];
  }

  // c. Get first day of month (Gregorian formula)
  public static int getFirstDay(int month, int year) {
    int y0 = year - (14 - month) / 12;
    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
    int m0 = month + 12 * ((14 - month) / 12) - 2;
    int d0 = (1 + x + (31 * m0) / 12) % 7;
    return d0;
  }

  // d. Print calendar
  public static void printCalendar(int month, int year) {
    System.out.println("\n" + getMonthName(month) + " " + year);
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");

    int firstDay = getFirstDay(month, year);
    int totalDays = getDaysInMonth(month, year);

    // d.i First loop for indentation
    for (int i = 0; i < firstDay; i++) {
      System.out.print("    ");
    }

    // d.ii Second loop to print days
    for (int day = 1; day <= totalDays; day++) {
      System.out.printf("%3d ", day);

      if ((day + firstDay) % 7 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter month (1-12): ");
    int month = input.nextInt();
    System.out.print("Enter year: ");
    int year = input.nextInt();

    printCalendar(month, year);
    input.close();
  }
}
