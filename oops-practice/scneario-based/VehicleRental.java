interface Total {
  void calculateBill();
}

abstract class Vehicle {
  private int id;
  protected String vehicleType;
  private int days;
  private int total;

  Vehicle(int id, String vehicleType, int days, int total) {
    this.id = id;
    this.vehicleType = vehicleType;
    this.days = days;
    this.total = total;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getDays() {
    return days;
  }

  public int getId() {
    return id;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  void displayInfo() {
    System.out.println("Id -: " + id);
    System.out.println("Vehicle Type -: " + vehicleType);
    System.out.println("Days -: " + days);
    System.out.println("Total cost -: " + total);
    System.out.println("----------------------");
  }
}

class Bike extends Vehicle implements Total {
  private int pricePerDays;

  Bike(int id, String vehicleType, int days, int pricePerDays, int total) {
    super(id, vehicleType, days, total);
    this.pricePerDays = pricePerDays;
  }

  @Override
  public void calculateBill() {
    setTotal(getDays() * pricePerDays);
  }
}

class Car extends Vehicle implements Total {
  private int pricePerDays;

  Car(int id, String vehicleType, int days, int pricePerDays, int total) {
    super(id, vehicleType, days, total);
    this.pricePerDays = pricePerDays;
  }

  @Override
  public void calculateBill() {
    setTotal(getDays() * pricePerDays);
  }
}

class Truck extends Vehicle implements Total {
  private int pricePerDays;

  Truck(int id, String vehicleType, int days, int pricePerDays, int total) {
    super(id, vehicleType, days, total);
    this.pricePerDays = pricePerDays;
  }

  @Override
  public void calculateBill() {
    setTotal(getDays() * pricePerDays);
  }
}

public class VehicleRental {
  public static void main(String[] args) {

    // Bike object
    Vehicle bike = new Bike(101, "Bike", 3, 500, 0);
    ((Total) bike).calculateBill();
    bike.displayInfo();

    // Car object
    Vehicle car = new Car(102, "Car", 5, 1200, 0);
    ((Total) car).calculateBill();
    car.displayInfo();

    // Truck object
    Vehicle truck = new Truck(103, "Truck", 2, 2500, 0);
    ((Total) truck).calculateBill();
    truck.displayInfo();
  }
}
