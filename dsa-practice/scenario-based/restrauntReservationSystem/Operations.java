package restrauntReservationSystem;

import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;

public class Operations {

  static void reserveTable(String name, int tableNumber, Date d, Time t, HashMap<Integer, Table> table,
      List<Reservation> ls, int count) {
    table.put(count, new Table(tableNumber, name, d, t));
    ls.add(new Reservation(tableNumber, false));
  }

  static void cancelReservation(String name, int tableNumber, Date d, Time t, HashMap<Integer, Table> table,
      List<Reservation> ls) {
     
  }

}
