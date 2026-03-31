package streamAPI;

import java.util.Arrays;
import java.util.List;

public class EmailNotifications {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
            "user1@gmail.com",
            "user2@gmail.com",
            "user3@gmail.com"
        );

        emails.forEach(email -> sendMailNotification(email));
    }


    private static void sendMailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}
