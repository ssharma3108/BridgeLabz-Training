import java.util.Scanner;

public class LibraryRemainder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Fine: ₹5 per day (only if returned after due date)");

    // asking the user for input for total number of books
    System.out.print("Enter the total number of books that you have issued -:");
    int n = sc.nextInt();

    int index = 1;
    int total = 0;

    // run a loop to find till the total no of books
    while (index != n) {
      int fine = 0;
      int late = 0;
      System.err.print("Enter due date (day number):- ");
      int due = sc.nextInt();

      System.out.print(" \"Enter return date (day number):- ");
      int re = sc.nextInt();

      if (due < re) {
        late = Math.abs(due - re);
        fine = late * 5;
        System.out.println("Book " + index + " returned late by " + late + " days.\r\n" + //
            "Fine charged: " + fine);
      } else {
        System.out.println("Book " + index + " returned early.\r\n" + //
            "No fine charged.");
      }
      index++;
      total += fine;
      fine = 0;
    }
    // print the total no of books with their fine amount
    System.out.println("Total books processed:- " + n + //
        "\n Total fine amount:- " + total);

  }
}
