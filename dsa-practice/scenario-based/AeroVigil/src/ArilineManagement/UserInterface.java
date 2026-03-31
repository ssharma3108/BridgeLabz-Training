package ArilineManagement;

import java.util.Scanner;
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