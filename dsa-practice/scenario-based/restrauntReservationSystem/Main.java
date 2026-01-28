package restrauntReservationSystem;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Table> table = new HashMap<>();
    List<Reservation> ls = new ArrayList<>();
    int count = 1;
    while (true) {
      System.out.print("Enter your choice -: 1. Reserve Table\r\n" + //
          "2. Cancel Reservation\r\n" + //
          "3. Show Available Tables\r\n" + //
          "4. Exit  = ");
      int choice = sc.nextInt();
      Operations o = new Operations();

      if (choice == 1) {
        System.out.print("Enter customer name -: ");
        String name = sc.next();
        System.out.print("Enter Table Number -: ");
        int n = sc.nextInt();
        System.out.print("Enter Date (yyyy-mm-dd) -: ");
        LocalDate date = LocalDate.parse(sc.next());
        System.out.print("Enter Time (HH:mm) -: ");
        LocalTime time = LocalTime.parse(sc.next());
        o.reserveTable(name, n, null, null, table, ls, count);
        count++;
        System.out.println("Table reserve successfully !");
      } else if (choice == 3) {
        for (Reservation reservation : ls) {
          System.out.println(ls);
        }
      }else if (choice ==2){
        
      }

    }
  }

}
