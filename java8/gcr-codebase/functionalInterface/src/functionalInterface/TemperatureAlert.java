package functionalInterface;

import java.util.Scanner;

@FunctionalInterface
interface Predicate<T> {
    boolean test(T x);
}

public class TemperatureAlert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int threshold = scanner.nextInt();

        Predicate<Double> alert = (x) -> x > threshold;

        System.out.println(alert.test(45.0));
    }
}
