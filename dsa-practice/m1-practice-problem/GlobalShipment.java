import java.util.*;

class ShipmentValidator {

    boolean validateShipmentCode(String code) {
        String regex = "^SHIP-[1-9]{1}[0-9]{5}$";

        if (code.matches(regex)) {
            return true;
        }

        return false;
    }

    public boolean validateShipmentDate(String date) {
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        boolean isLeap = false;

        // leap year check
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeap = true;
        }

        if (year >= 2000 && year <= 2099) {

            if ((month == 2 && isLeap) && (day >= 1 && day <= 29)) {
                return true;
            } else if ((month == 2 && !isLeap) && (day >= 1 && day <= 28)) {
                return true;
            }

            if ((month == 4 || month == 6 || month == 9 || month == 11) && (day >= 1 && day <= 30)) {
                return true;
            } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12) && (day >= 1 && day <= 31)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public boolean validateMode(String mode) {

        String[] modes = {"AIR", "SEA", "ROAD", "RAIL", "EXPRESS", "FREIGHT"};
        boolean isFound = false;

        for (String x : modes) {
            if (x.equals(mode)) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    public boolean validateWeight(String weight) {

        double w = Double.parseDouble(weight);

        String[] data = weight.split("\\.");
        String first = data[0];
        String second = data.length > 1 ? data[1] : "";

        if ((w >= 0 && w <= 999999.99) && second.length() <= 2) {
            return true;
        }

        return false;
    }

    public boolean validateDeliveryStatus(String status) {

        String[] del = {"DELIVERED", "CANCELLED", "IN_TRANSIT"};
        boolean isFound = false;

        for (String x : del) {
            if (x.equals(status)) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }
}

class GlobalShipment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ShipmentValidator s = new ShipmentValidator();

        for (int i = 0; i < n; i++) {

            String str = sc.nextLine();

            String[] data = str.split("\\|");

            String ship = data[0];
            String date = data[1];
            String mode = data[2];
            String weight = data[3];
            String status = data[4];

            boolean result =
                    s.validateShipmentCode(ship) &&
                    s.validateShipmentDate(date) &&
                    s.validateMode(mode) &&
                    s.validateWeight(weight) &&
                    s.validateDeliveryStatus(status);

            if (result) {
                System.out.println("COMPLIANT RECORD");
            } else {
                System.out.println("NON-COMPLIANT RECORD");
            }
        }
    }
}