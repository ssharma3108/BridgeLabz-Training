import java.time.*;
import java.time.format.*;

public class DateTimeFormat {
  public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.now();

    // print default format
    System.out.println(dt);

    // dd/MM/yyyy
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println(dt.format(f));

    // EEE, MMM dd, yyyy
    DateTimeFormatter newF = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
    System.out.println(dt.format(newF));
  }
}