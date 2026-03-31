package lambdaExpression;
import java.util.*;
import java.util.function.Predicate;

// Alert class
class Alert {
    String type;
    String message;
    String priority;

    Alert(String type, String message, String priority) {
        this.type = type;
        this.message = message;
        this.priority = priority;
    }
}

public class NotificationFiltering {

    public static void main(String[] args) {

        // List of alerts
        List<Alert> alerts = Arrays.asList(
                new Alert("Emergency", "Heart rate critical", "High"),
                new Alert("Medication", "Take insulin at 8:00 AM", "Medium"),
                new Alert("Appointment", "Doctor visit today", "High"),
                new Alert("General", "Drink more water", "Low")
        );

        // Predicate using lambda (user preference)
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equalsIgnoreCase("Emergency");

        Predicate<Alert> highPriorityOnly =
                alert -> alert.priority.equalsIgnoreCase("High");

        Predicate<Alert> medicationOnly =
                alert -> alert.type.equalsIgnoreCase("Medication");

        // Apply filters
        System.out.println("---- Emergency Alerts ----");
        filterAlerts(alerts, emergencyOnly);

        System.out.println("\n---- High Priority Alerts ----");
        filterAlerts(alerts, highPriorityOnly);

        System.out.println("\n---- Medication Alerts ----");
        filterAlerts(alerts, medicationOnly);
    }

    // Method to filter alerts
    static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {
        boolean found = false;

        for (Alert alert : alerts) {
            if (condition.test(alert)) {
                System.out.println(alert.type + ": " + alert.message);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No alerts available based on selected preference");
        }
    }
}
