package restrauntReservationSystem;

import java.sql.Time;
import java.util.*;

// Table class
class Table {
  int tableNumber;
  String customerName;
  Date date;
  Time time;

  Table(int tableNumber, String customerName, Date date, Time time) {
    this.tableNumber = tableNumber;
    this.customerName = customerName;
    this.date = date;
    this.time = time;
  }
}
