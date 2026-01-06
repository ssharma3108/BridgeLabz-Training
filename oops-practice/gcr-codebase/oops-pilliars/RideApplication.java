// GPS Interface
interface GPS {
  void getCurrentLocation();

  void updateLocation();
}

// Abstract Vehicle class
abstract class Vehicle {
  private int vehicleId;
  private String driverName;
  private int ratePerKm;

  Vehicle(int vehicleId, String driverName, int ratePerKm) {
    this.vehicleId = vehicleId;
    this.driverName = driverName;
    this.ratePerKm = ratePerKm;
  }

  public int getRatePerKm() {
    return ratePerKm;
  }

  void getVehicleDetails() {
    System.out.println("Vehicle ID   : " + vehicleId);
    System.out.println("Driver Name  : " + driverName);
    System.out.println("Rate per Km  : " + ratePerKm);
  }

  abstract double calculateFare();
}

// Bike
class Bike extends Vehicle implements GPS {

  private int distance;
  private String location;

  Bike(int vehicleId, String driverName, int ratePerKm, int distance, String location) {
    super(vehicleId, driverName, ratePerKm);
    this.distance = distance;
    this.location = location;
  }

  @Override
  public void getCurrentLocation() {
    System.out.println("Bike Location : " + location);
  }

  @Override
  public void updateLocation() {
    location = "Bike Destination Reached";
    System.out.println("Bike Location Updated");
  }

  @Override
  double calculateFare() {
    return distance * getRatePerKm();
  }

  @Override
  void getVehicleDetails() {
    super.getVehicleDetails();
    System.out.println("Bike Fare    : " + calculateFare());
    getCurrentLocation();
    updateLocation();
    getCurrentLocation();
  }
}

// Auto
class Auto extends Vehicle implements GPS {

  private int distance;
  private String location;

  Auto(int vehicleId, String driverName, int ratePerKm, int distance, String location) {
    super(vehicleId, driverName, ratePerKm);
    this.distance = distance;
    this.location = location;
  }

  @Override
  public void getCurrentLocation() {
    System.out.println("Auto Location : " + location);
  }

  @Override
  public void updateLocation() {
    location = "Auto Destination Reached";
    System.out.println("Auto Location Updated");
  }

  @Override
  double calculateFare() {
    return distance * getRatePerKm();
  }

  @Override
  void getVehicleDetails() {
    super.getVehicleDetails();
    System.out.println("Auto Fare    : " + calculateFare());
    getCurrentLocation();
    updateLocation();
    getCurrentLocation();
  }
}

// car
class Car extends Vehicle implements GPS {

  private int distance;
  private String location;

  Car(int vehicleId, String driverName, int ratePerKm, int distance, String location) {
    super(vehicleId, driverName, ratePerKm);
    this.distance = distance;
    this.location = location;
  }

  public int getDistance() {
    return distance;
  }

  public String getLocation() {
    return location;
  }

  @Override
  double calculateFare() {
    return distance * getRatePerKm();
  }

  @Override
  public void getCurrentLocation() {
    System.out.println("Current Location : " + location);
  }

  @Override
  public void updateLocation() {
    location = "Destination Reached";
    System.out.println("Location Updated Successfully");
  }

  @Override
  void getVehicleDetails() {
    super.getVehicleDetails();
    System.out.println("Fare Price : " + calculateFare());
    getCurrentLocation();
    updateLocation();
    getCurrentLocation();
  }
}

// ---------------- MAIN CLASS ----------------
public class RideApplication {
  public static void main(String[] args) {

    Vehicle bike = new Bike(101, "Ravi", 5, 10, "City Center");
    Vehicle auto = new Auto(102, "Amit", 8, 7, "Bus Stand");
    Vehicle car = new Car(21, "shivam", 12, 50, "haryana");

    System.out.println("----- Bike Ride -----");
    bike.getVehicleDetails();

    System.out.println("\n----- Auto Ride -----");
    auto.getVehicleDetails();

    System.out.println("\n----- Car Ride -----");
    car.getVehicleDetails();

  }
}
