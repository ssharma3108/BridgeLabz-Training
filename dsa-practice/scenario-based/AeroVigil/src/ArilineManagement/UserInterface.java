package ArilineManagement;

import java.util.Scanner;

class InvalidFlightException extends Exception{
	public InvalidFlightException(String s) {
		super(s);
	}
}


class FlightUtil {

    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
        if (!flightNumber.matches("FL-[1-9][0-9]{3}")) {
            throw new InvalidFlightException(
                "The flight number " + flightNumber + " is invalid"
            );
        }
        return true;
    }

    public boolean validateFlightName(String flightName) throws InvalidFlightException {
        if (flightName.equals("SpiceJet") ||
            flightName.equals("Vistara") ||
            flightName.equals("IndiGo") ||
            flightName.equals("Air Arabia")) {
            return true;
        }

        throw new InvalidFlightException(
            "The flight name " + flightName + " is invalid"
        );
    }

    public boolean validatePassengerCount(int passengerCount, String flightName)
            throws InvalidFlightException {

        int maxCapacity = switch (flightName) {
            case "SpiceJet" -> 396;
            case "Vistara" -> 615;
            case "IndiGo" -> 230;
            case "Air Arabia" -> 130;
            default -> 0;
        };

        if (passengerCount <= 0 || passengerCount > maxCapacity) {
            throw new InvalidFlightException(
                "The passenger count " + passengerCount + " is invalid for " + flightName
            );
        }
        return true;
    }

    public double calculateFuelToFillTank(String flightName, double currentFuelLevel)
            throws InvalidFlightException {

        double capacity = switch (flightName) {
            case "SpiceJet" -> 200000;
            case "Vistara" -> 300000;
            case "IndiGo" -> 250000;
            case "Air Arabia" -> 150000;
            default -> 0;
        };

        if (currentFuelLevel < 0 || currentFuelLevel > capacity) {
            throw new InvalidFlightException(
                "Invalid fuel level for " + flightName
            );
        }

        return capacity - currentFuelLevel;
    }
}

public class UserInterface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flight details");

        String input = scanner.nextLine();
        String[] data = input.split(":");

        String flightNumber = data[0];
        String flightName = data[1];
        int passengerCount = Integer.parseInt(data[2]);
        double currentFuelLevel = Double.parseDouble(data[3]);

        FlightUtil util = new FlightUtil();

        try {
            util.validateFlightNumber(flightNumber);
            util.validateFlightName(flightName);
            util.validatePassengerCount(passengerCount, flightName);

            double fuel = util.calculateFuelToFillTank(flightName, currentFuelLevel);
            System.out.println("Fuel required to fill the tank: " + fuel + " liters");

        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
    }
}