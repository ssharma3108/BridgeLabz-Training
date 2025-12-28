import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class CurrentTime {
  public static void main(String[] args) {
    // using butiltin function to get the output
    ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
    ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

    System.out.println("Time in GMT -:" + gmt);
    System.out.println("Time in IST -:" + ist);
    System.out.println("Time in PST -:" + pst);
  }
}
