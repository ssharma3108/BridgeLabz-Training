public class WatchSimulation {
  public static void main(String[] args) {
    // Loop for hours (0 to 23)
    for (int hour = 0; hour < 24; hour++) {

      // Loop for minutes (0 to 59)
      for (int minute = 0; minute < 60; minute++) {

        // Print time in HH:MM format
        System.out.printf("%02d:%02d%n", hour, minute);

        // Stop the watch at 13:00 (power cut simulation)
        if (hour == 13 && minute == 0) {
          System.out.println("⚠️ Power cut detected!");
          System.out.println("Watch stopped at 13:00");
          return; // exits the program completely
        }
      }
    }
  }
}
