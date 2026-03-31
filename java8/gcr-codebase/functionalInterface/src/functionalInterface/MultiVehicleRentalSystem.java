package functionalInterface;

// Interface
interface Rental {
    void rent();
    void returnVehicle();
}

// Car class
class Car implements Rental {

    @Override
    public void rent() {
        System.out.println("Car Rented Successfully");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car Returned Successfully");
    }
}

// Bus class
class Bus implements Rental {

    @Override
    public void rent() {
        System.out.println("Bus Rented Successfully");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus Returned Successfully");
    }
}

// Bike class
class Bike implements Rental {

    @Override
    public void rent() {
        System.out.println("Bike Rented Successfully");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike Returned Successfully");
    }
}

// Main class
public class MultiVehicleRentalSystem {

    public static void main(String[] args) {

        Rental car = new Car();
        Rental bus = new Bus();
        Rental bike = new Bike();

        car.rent();
        bus.rent();
        bike.rent();

        System.out.println("===================");

        car.returnVehicle();
        bus.returnVehicle();
        bike.returnVehicle();
    }
}
