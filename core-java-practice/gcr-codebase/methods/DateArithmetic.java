import java.time.LocalDate;

public class DateArithmetic {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();

    System.out.println("Current date -:" + date);

    // adds 7 days, 1 month, and 2 years to it.

    LocalDate newdate = date.plusDays(7).plusMonths(1).plusYears(2);

    System.out.println("After Modify the date the new date is -:" + newdate);

    // subtracts 3 weeks
    LocalDate modifyDate = newdate.minusWeeks(3);

    System.out.println("After modify the current date the new date will be -:" + modifyDate);

  }
}
