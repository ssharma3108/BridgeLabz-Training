class Vehicle {
  // static variable
  static double registrationFee = 1500000.0;
  // instance variables
  String ownerName;
  String vehicleType;
  // final variable
  final String registrationNumber;

  // constructor'
  Vehicle(String registrationNumber, String ownerName, String vehicleType) {
    this.registrationNumber = registrationNumber;
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
  }

  // static method to update registration fee
  static void updateFee(double newFee) {
    registrationFee = newFee;
  }

  // display vehicle details using instanceof
  static void displayVehicleDetail(Object obj) {
    if (obj instanceof Vehicle) {
      Vehicle v = (Vehicle) obj;
      System.out.println("Owner Name: " + v.ownerName);
      System.out.println("Vehicle Type: " + v.vehicleType);
      System.out.println("Registration Number: " + v.registrationNumber);
      System.out.println("Registration Fee: " + registrationFee);
      System.out.println();
    } else {
      System.out.println("Invalid vehicle object");
    }
  }

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle("0001", "madhav", "sedad");
    Vehicle v2 = new Vehicle("0002", "shivam", "suv");
    // display vehicle registration details
    displayVehicleDetail(v1);
    displayVehicleDetail(v2);
  }
}