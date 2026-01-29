package restrauntReservationSystem;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Table> tableMap = new HashMap<>();
        List<Reservation> reservations = new ArrayList<>();
        int count = 1;

        while (true) {

            System.out.println("\n1. Reserve Table");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Show Available Tables");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.next();

                    System.out.print("Enter table number: ");
                    int tableNumber = sc.nextInt();

                    System.out.print("Enter date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.next());

                    System.out.print("Enter time (HH:mm): ");
                    LocalTime time = LocalTime.parse(sc.next());

                    try {
                        Operations.reserveTable(
                                name,
                                tableNumber,
                                Date.valueOf(date),
                                Time.valueOf(time),
                                tableMap,
                                reservations,
                                count++
                        );
                        System.out.println("Table reserved successfully!");
                    } catch (TableAlreadyReservedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter table number to cancel: ");
                    int cancelTable = sc.nextInt();
                    Operations.cancelReservation(cancelTable, reservations);
                    break;

                case 3:
                    Operations.showAvailableTables(tableMap, reservations);
                    break;

                case 4:
                    System.out.println("Thank you for using the system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
