//searching , booking and avaliable

import java.util.Scanner;
import java.util.concurrent.Callable;

interface calculate {
  void calculateBill();

}

abstract class Plane {
  private int id;
  private String name;
  private int distance;

  Plane(int id, String name, int distance) {
    this.id = id;
    this.name = name;
    this.distance = distance;
  }

  // getter
  public String getName() {
    return name;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public int getId() {
    return id;
  }

  void displayInfo() {
    System.err.println("Id -: " + id);
    System.out.println("Name -: " + name);
  }
}

class Flight extends Plane {
  private String source;
  private String destination;

  Flight(int id, String name, String source, String destination, int distance) {
    super(id, name, distance);
    this.source = source;
    this.destination = destination;
  }

  public String getSource() {
    return source;
  }

  public String getDestination() {
    return destination;
  }
}

class Booking extends Plane implements calculate {
  private int amount;
  private int userId;
  private String userName;

  Booking(int id, String name, int distance, int amount, String userName, int userId) {
    super(id, name, distance);
    this.amount = amount;
    this.userId = userId;
    this.userName = userName;
  }

  // getter
  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = 100;
  }

  public int getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public void calculateBill() {
    int bill = getDistance() * amount;
    System.out.println("Total Bill -: " + bill);
  }

  void displayInfo() {
    super.displayInfo();
    calculateBill();
  }

}

public class FlightBookingSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Flight[] flights = {
        new Flight(101, "Air India", "Delhi", "Mumbai", 180),
        new Flight(102, "IndiGo", "Delhi", "Bangalore", 200),
        new Flight(103, "SpiceJet", "Mumbai", "Goa", 400)
    };

    while (true) {
      System.out.print("Enter your choice -: 1 for display | 2 for booking | 3 for searching | 4 for exit -: ");
      int choice = sc.nextInt();

      if (choice == 1) {
        for (Flight flight : flights) {
          System.out.println(
              "Flight Id " + flight.getId() + " Name -: " + flight.getName() + " Source -: " + flight.getSource()
                  + " Destination -: " + flight.getDestination() + " Distance -: " + flight.getDistance());
        }
     } else if (choice == 2) {
        System.out.print("Enter the source -: ");
        String source = sc.next();
        System.out.print("Enter the destination -: ");
        String destination = sc.next();
        boolean isF = false;

        for (Flight flight : flights) {
          if (flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)) {
            isF = true;
            System.out.println("Flight Found! Please enter passenger details.");
            sc.nextLine();
            System.out.print("Enter Passenger Name: ");
            String userN = sc.nextLine();
            System.out.print("Enter User ID: ");
            int userid = sc.nextInt();
            Booking myBooking = new Booking(
                flight.getId(),
                flight.getName(),
                flight.getDistance(),
                15,
                userN,
                userid
            );

            System.out.println("\n--- Booking Confirmed ---");
            System.out.println("Passenger: " + myBooking.getUserName() + " (ID: " + myBooking.getUserId() + ")");
            myBooking.displayInfo();
            break;
          }
        }

        if (!isF) {
          System.out.println("No such type of flight.......");
        }else if (choice == 3) {
        System.out.print("Enter the destination place -: ");
        String dest = sc.next();
        boolean isFound = false;

        for (Flight flight : flights) {
          if (flight.getDestination().equalsIgnoreCase(dest)) {
            System.out.println("Flight is avaliable....");
            System.out.println(
                "Flight Id " + flight.getId() + " Name -: " + flight.getName() + " Source -: " + flight.getSource()
                    + " Destination -: " + flight.getDestination() + " Distance -: " + flight.getDistance());
            isFound = true;
          }
        }

        if (!isFound) {
          System.out.println("No such Type of flight............");
        }

      } else if (choice == 4) {
        System.out.println("Thanks for visiting.......!");
        break;
      } else {
        System.out.println("invalid input");
        break;
      }

    }
  }
  }
}
