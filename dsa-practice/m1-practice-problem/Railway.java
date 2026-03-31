import java.util.*;

// Booking Class
class Booking {
    String passengerId;
    int seatCount;
    double bookingFare;

    public Booking(String passengerId, int seatCount, double bookingFare) {
        this.passengerId = passengerId;
        this.seatCount = seatCount;
        this.bookingFare = bookingFare;
    }

    public double getBookingFare() {
        return bookingFare;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public int getSeatCount() {
        return seatCount;
    }
}

// Train Class
class Train {
    String trainId;
    String source;
    String destination;
    int totalSeats;
    double baseFare;

    int availableSeats;
    List<Booking> bookings = new ArrayList<>();

    public Train(String trainId, String source, String destination, int totalSeats, double baseFare) {
        this.trainId = trainId;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.baseFare = baseFare;
        this.availableSeats = totalSeats;
    }
}

// Railway Manager Class
class RailwayManager {

    List<Train> trains = new ArrayList<>();

    public int addTrain(String trainId, String source, String destination, int totalSeats, double baseFare) {

        boolean isFound = false;

        for (Train t : trains) {
            if (t.trainId.equals(trainId)) {
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            trains.add(new Train(trainId, source, destination, totalSeats, baseFare));
        }

        return 0;
    }

    public int bookSeats(String trainId, String passengerId, int seatCount) {

        boolean isFound = false;

        for (Train t : trains) {
            if (t.trainId.equals(trainId)) {
                isFound = true;

                if (t.availableSeats < seatCount) {
                    System.out.println("Booking failed");
                    return 0;
                }

                double total = (seatCount * t.baseFare) + (seatCount * 25);

                t.availableSeats -= seatCount;
                t.bookings.add(new Booking(passengerId, seatCount, total));

                System.out.println("BOOKED " + trainId + " " + passengerId + " " + (int) total);
                return 0;
            }
        }

        if (!isFound) {
            System.out.println("Booking failed");
        }

        return 0;
    }

    public int cancelBooking(String trainId, String passengerId) {

        for (Train t : trains) {
            if (t.trainId.equals(trainId)) {

                Iterator<Booking> it = t.bookings.iterator();

                while (it.hasNext()) {
                    Booking b = it.next();

                    if (b.getPassengerId().equals(passengerId)) {

                        t.availableSeats += b.getSeatCount();
                        it.remove();

                        System.out.println("CANCELLED " + trainId + " " + passengerId);
                        return 0;
                    }
                }

                System.out.println("Cancellation failed");
                return 0;
            }
        }

        System.out.println("Cancellation failed");
        return 0;
    }

    public List<Train> findRoute(String source, String destination) {

        boolean found = false;

        for (Train t : trains) {
            if (t.source.equals(source) && t.destination.equals(destination)) {
                System.out.println(t.trainId + " " + t.availableSeats);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No trains available");
        }

        return null;
    }

    public List<Train> getRevenueSummary() {

        boolean hasRevenue = false;

        for (Train t : trains) {

            double sum = 0;

            for (Booking b : t.bookings) {
                sum += b.getBookingFare();
            }

            if (sum > 0) {
                hasRevenue = true;
            }

            System.out.println(t.trainId + " " + (int) sum);
        }

        if (!hasRevenue) {
            System.out.println("No revenue generated");
        }

        return null;
    }
}

// Main Class
class Railway {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        RailwayManager manager = new RailwayManager();

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];

            if (command.equals("ADDTRAIN")) {

                String trainId = parts[1];
                String source = parts[2];
                String destination = parts[3];
                int totalSeats = Integer.parseInt(parts[4]);
                double baseFare = Double.parseDouble(parts[5]);

                manager.addTrain(trainId, source, destination, totalSeats, baseFare);

            } else if (command.equals("BOOK")) {

                String trainId = parts[1];
                String passengerId = parts[2];
                int seatCount = Integer.parseInt(parts[3]);

                manager.bookSeats(trainId, passengerId, seatCount);

            } else if (command.equals("CANCEL")) {

                String trainId = parts[1];
                String passengerId = parts[2];

                manager.cancelBooking(trainId, passengerId);

            } else if (command.equals("ROUTE")) {

                String source = parts[1];
                String destination = parts[2];

                manager.findRoute(source, destination);

            } else if (command.equals("SUMMARY")) {

                manager.getRevenueSummary();
            }
        }

        sc.close();
    }
}