import java.util.*;

// Custom Exception
class InvalidTimeFormatException extends Exception {
  InvalidTimeFormatException(String message) {
    super(message);
  }
}

class Movie {

  // Add movie
  public void addMovie(List<String> movie, List<String> time, String name, String duration) {
    movie.add(name);
    time.add(duration);
    System.out.println("Movie added successfully...");
  }

  // Display all movies
  public void displayAllMovie(List<String> movie, List<String> time) {
    if (movie.isEmpty()) {
      System.out.println("No movies available.");
      return;
    }

    for (int i = 0; i < movie.size(); i++) {
      System.out.println(
          (i + 1) + ". Movie: " + movie.get(i) + " | Time: " + time.get(i));
    }
  }

  // Search movie
  public void searchMovie(List<String> movieTitles, List<String> showTimes, String keyword) {
    try {
      boolean isFound = false;

      for (int i = 0; i < movieTitles.size(); i++) {
        if (movieTitles.get(i).contains(keyword)) {
          System.out.println(
              String.format("Movie: %s | Time: %s",
                  movieTitles.get(i),
                  showTimes.get(i)));
          isFound = true;
        }
      }

      if (!isFound) {
        System.out.println("Movie not found");
      }

    } catch (IndexOutOfBoundsException e) {
      System.out.println("Invalid index access while searching movies");
    }
  }

  // Generate printable report (List → Array)
  public void generateReport(List<String> movie, List<String> time) {
    String[] movieArray = movie.toArray(new String[0]);
    String[] timeArray = time.toArray(new String[0]);

    System.out.println("----- Movie Schedule Report -----");
    for (int i = 0; i < movieArray.length; i++) {
      System.out.println(
          String.format("Movie: %s | Time: %s", movieArray[i], timeArray[i]));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> movie = new ArrayList<>();
    List<String> time = new ArrayList<>();
    Movie m = new Movie();

    while (true) {
      System.out.print(
          "Enter choice: 1-Add | 2-View | 3-Search | 4-Report | 5-Exit : ");
      int choice = sc.nextInt();
      sc.nextLine();

      if (choice == 1) {
        System.out.print("Enter movie title: ");
        String title = sc.nextLine();

        System.out.print("Enter showtime (HH:mm): ");
        String duration = sc.next();

        try {
          // Time format validation
          if (!duration.matches("\\d{2}:\\d{2}")) {
            throw new InvalidTimeFormatException("Time must be in HH:mm format");
          }

          String[] parts = duration.split(":");
          int hour = Integer.parseInt(parts[0]);
          int minute = Integer.parseInt(parts[1]);

          if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new InvalidTimeFormatException("Invalid time value");
          }

          m.addMovie(movie, time, title, duration);

        } catch (InvalidTimeFormatException e) {
          System.out.println(e.getMessage());
        }

      } else if (choice == 2) {
        m.displayAllMovie(movie, time);

      } else if (choice == 3) {
        System.out.print("Enter movie name to search: ");
        String name = sc.nextLine();
        m.searchMovie(movie, time, name);

      } else if (choice == 4) {
        m.generateReport(movie, time);

      } else if (choice == 5) {
        System.out.println("Thanks for visiting...");
        break;

      } else {
        System.out.println("Invalid choice");
      }
    }
    sc.close();
  }
}
