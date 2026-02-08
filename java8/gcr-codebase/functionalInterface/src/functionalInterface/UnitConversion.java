package functionalInterface;

interface Conversions {

    static double kmToMiles(int km) {
        return km * 0.621371;
    }

    static double kgToLbs(int kg) {
        return kg * 2.20462;
    }
}

public class UnitConversion {
    public static void main(String[] args) {

        System.out.println("10 km = " + Conversions.kmToMiles(10) + " miles");
        System.out.println("5 kg = " + Conversions.kgToLbs(5) + " lbs");
    }
}
