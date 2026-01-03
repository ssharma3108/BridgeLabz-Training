// 1. Define the interface
interface Refuelable {
  void refuel();
}

// 2. Define the superclass
class Vehicle {
  int maxSpeed;
  String model;

  Vehicle(int maxSpeed, String model) {
    this.maxSpeed = maxSpeed;
    this.model = model;
  }

  void displayDetails() {
    System.out.println("Model: " + model + " | Speed: " + maxSpeed + "km/h");
  }
}

// 3. Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
  ElectricVehicle(int maxSpeed, String model) {
    super(maxSpeed, model);
  }

  void charge() {
    System.out.println(model + " is charging its battery...");
  }
}

// 4. Subclass: PetrolVehicle (Hybrid Inheritance)
class PetrolVehicle extends Vehicle implements Refuelable {
  PetrolVehicle(int maxSpeed, String model) {
    super(maxSpeed, model);
  }

  // Implementing the interface method
  public void refuel() {
    System.out.println(model + " is refueling at the petrol pump...");
  }
}

// Main class to test the requirements
public class VehicleSystem {
  public static void main(String[] args) {
    ElectricVehicle tesla = new ElectricVehicle(250, "Tesla S");
    PetrolVehicle toyota = new PetrolVehicle(200, "Toyota Camry");

    System.out.println("--- EV Details ---");
    tesla.displayDetails();
    tesla.charge();

    System.out.println("\n--- Petrol Details ---");
    toyota.displayDetails();
    toyota.refuel();
  }
}