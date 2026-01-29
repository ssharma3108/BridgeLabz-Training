package restrauntReservationSystem;

class Reservation {
  int tableNumber;
  boolean isBooked;

  Reservation(int tableNumber, boolean isBooked) {
    this.tableNumber = tableNumber;
    this.isBooked = isBooked;
  }
}
