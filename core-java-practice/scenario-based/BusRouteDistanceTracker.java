import java.util.*;

public class BusRouteDistanceTracker {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    System.out.println("Total distance travelled : 0 km");
    System.out.println("Each Stop add 3 km");

    int total = 0; // at start the total distance is 0 km

    // run a loop for every yes it will add 3 km and for no it break the loop and
    // print the total distance
    while (true) {
      System.out.print("Have you reached a stop? (yes/no):");
      String answer = sc.next();

      // if yes 3 km is added and print the output
      if (answer.equals("yes")) {
        total += 3;
        System.out.println("========================================");
        System.out.println("Stop reached.\r\n" + //
            "Distance added: 3km \n" + //
            "Total distance travelled: " + total);
        System.out.println("========================================");
      } else {
        System.out.println("Passenger has exited the bus.\r\n" + //
            "Final distance travelled: " + total + //
            "\nThank you for using the bus service.");
        System.out.println("========================================");
        break;
      }

    }

  }
}
