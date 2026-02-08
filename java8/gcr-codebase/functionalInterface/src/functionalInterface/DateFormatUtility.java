package functionalInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {

    // static interface method
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 2, 4);

        String formattedDate1 = DateUtils.formatDate(date, "dd/MM/yyyy");
        String formattedDate2 = DateUtils.formatDate(date, "MMM dd, yyyy");

        System.out.println("Formatted Date 1: " + formattedDate1);
        System.out.println("Formatted Date 2: " + formattedDate2);
    }
}
