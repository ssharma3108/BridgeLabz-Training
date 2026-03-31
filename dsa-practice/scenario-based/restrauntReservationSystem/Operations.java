package restrauntReservationSystem;

import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;

class Operations {

  // Reserve table
  static void reserveTable(
      String name,
      int tableNumber,
      Date date,
      Time time,
      HashMap<Integer, Table> tableMap,
      List<Reservation> reservations,
      int count) throws TableAlreadyReservedException {

    // Prevent double booking
    for (Reservation r : reservations) {
      if (r.tableNumber == tableNumber && r.isBooked) {
        throw new TableAlreadyReservedException(
            "Table " + tableNumber + " is already reserved");
      }
    }

    tableMap.put(count, new Table(tableNumber, name, date, time));
    reservations.add(new Reservation(tableNumber, true));
  }

  // Cancel reservation
  static void cancelReservation(int tableNumber, List<Reservation> reservations) {
    for (int i = 0; i < reservations.size(); i++) {
      Reservation r = reservations.get(i);
      if (r.tableNumber == tableNumber && r.isBooked) {
        reservations.remove(i);
        System.out.println("Reservation cancelled successfully.");
        return;
      }
    }
    System.out.println("No reservation found for table " + tableNumber);
  }

  // Show available tables
  static void showAvailableTables(
      HashMap<Integer, Table> tableMap,
      List<Reservation> reservations) {
    System.out.println("Available Tables:");
    for (Table t : tableMap.values()) {
      boolean booked = false;
      for (Reservation r : reservations) {
        if (r.tableNumber == t.tableNumber && r.isBooked) {
          booked = true;
          break;
        }
      }
      if (!booked) {
        System.out.println("Table " + t.tableNumber);
      }
    }
  }
}