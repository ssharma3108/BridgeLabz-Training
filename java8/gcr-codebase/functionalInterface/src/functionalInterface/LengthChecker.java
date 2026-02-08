package functionalInterface;

import java.util.Scanner;
import java.util.function.Function;

public class LengthChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character limit: ");
        int limit = scanner.nextInt();

        Function<String, Integer> lengthFunction = s -> s.length();

        String message = "Welcome to Java Stream API";
        int messageLength = lengthFunction.apply(message);

        System.out.println("Message length: " + messageLength);

        if (messageLength > limit) {
            System.out.println("Status: Exceeds character limit");
        } else {
            System.out.println("Status: Within character limit");
        }

        scanner.close();
    }
}
