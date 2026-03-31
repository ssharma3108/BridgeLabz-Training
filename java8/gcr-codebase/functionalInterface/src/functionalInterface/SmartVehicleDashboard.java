package functionalInterface;

interface Vehicle {

    void displaySpeed(int speed);

    // new feature added later
    default void displayBattery(int percentage) {
        System.out.println("Battery Level: " + percentage + "%");
    }
}

class Car implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Current Speed: " + speed + " km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Current Speed: " + speed + " km/h");
    }

    // optional override
    @Override
    public void displayBattery(int percentage) {
        System.out.println("Electric Car Battery Level: " + percentage + "%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.displaySpeed(80);

        Vehicle electricCar = new ElectricCar();
        electricCar.displaySpeed(80);
        electricCar.displayBattery(75);
    }
}
