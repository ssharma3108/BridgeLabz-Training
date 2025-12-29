import java.util.Scanner;

public class MovieBooking {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      String movieCategory = "";
      String seatCategory = "";
      String snackDemand = "";
      int snackPrice = 0;
      int seatPrice=0;
      int total = 0;
      System.out.print("Moive Menu");
      System.out.println("\n1. Action\r\n" + //
          "2. Comedy\r\n" + //
          "3. Drama");
      System.out.print("Choose the number 1 ,2 ,3 -: ");
      int movieType = sc.nextInt();
      if (movieType == 1) {
        movieCategory += "Action";
      } else if (movieType == 2) {
        movieCategory += "Comedy";
      } else {
        movieCategory += "Drama";
      }

      // for choosing seat
      System.out.println("\n 1. Gold Seat → ₹300\r\n" + //
          "2. Silver Seat → ₹200");
      System.out.print("Choose the number 1 ,2 -: ");
      int seatType = sc.nextInt();
      if (seatType == 1) {
        seatCategory += "Gold";
        seatPrice+=300;
      } else {
        seatCategory += "Silver";
        seatPrice+=200;
      }
      // for snacks
      System.err.println("\n 1. Yes → ₹100\r\n" + //
          "2. No → ₹0");
      System.out.print("Choose for snacks 1,2 -:");
      int snacks = sc.nextInt();
      if (snacks == 1) {
        snackDemand += "yes";
        snackPrice += 100;
      } else {
        snackDemand += "No";
        snackPrice += 0;
      }

      // now make a bill
      System.out.println("===============================");
      System.err.println("Movie: " + movieCategory + //
          "\nSeat Type: " + seatCategory + //
          "\nSnacks: " + snackDemand + //
          "\nTicket Price: " +seatPrice+ //
          "\nSnacks Price: " + snackPrice + //
          "\nTotal Amount: " + (total +snackPrice+seatPrice) + //
          "\nBooking Confirmed 🎉");

      System.out.println("===============================");

      movieCategory = "";
      seatCategory = "";
      snackPrice = 0;
      total = 0;
      seatPrice=0;

      System.out.print("Do you want to book another ticket? (yes/no):-:");
      String reply = sc.next();
      if (reply.equals("no")) {
        System.out.println("Thank you for using the Movie Ticket Booking App 🎬\r\n" + //
            "Enjoy your movie!\r\n" + //
            "");
        System.out.println("===============================");
        break;
      }

    }
  }
}
