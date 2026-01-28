package restrauntReservationSystem;

import java.sql.Time;
import java.util.*;

public class Table {
  int tableNumber;
  String customerName;
  Date date;
  Time time;

  Table(int tableNumber, String customerName, Date date, Time time) {
    this.tableNumber = tableNumber;
    this.time = time;
    this.date = date;
    this.customerName = customerName;
  }

  public int getTableNumber() {
    return tableNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public Date getDate() {
    return date;
  }

  public Time getTime() {
    return time;
  }

}
