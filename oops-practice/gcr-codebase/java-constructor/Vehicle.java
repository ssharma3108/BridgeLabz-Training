public class Vehicle {

  // instance variables
  String ownerName;
  int vehicleType;

  // class variable
  static int registrationFee = 500000;

  // constructor
  Vehicle(String ownerName, int vehicleType) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
  }

  // instance method
  void displayVehicleDetails() {
    System.out.println("Owner Name: " + ownerName);
    System.out.println("Vehicle Type: " + vehicleType);
    System.out.println("Registration Fee: " + registrationFee);
  }

  // class method
  static void updateRegistrationFee(int newFee) {
    registrationFee = newFee; // fee update kar deta hai
    System.out.println("Registration Fee updated to: " + registrationFee);
  }

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle("Shivam", 4);
    Vehicle v2 = new Vehicle("Rahul", 2);

    v1.displayVehicleDetails();
    System.out.println(); // blank line

    Vehicle.updateRegistrationFee(600000); // fee change
    v2.displayVehicleDetails();
  }
}
