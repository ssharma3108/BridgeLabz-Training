import java.util.Scanner;

public class InvoiceGenerator {

    // Method to calculate total amount
    static int getTotalAmount(String[] tasks) {
        int total = 0;

        for (String task : tasks) {
            // extract number from each task
            String amountStr = task.replaceAll("[^0-9]", "");
            if (!amountStr.isEmpty()) {
                total += Integer.parseInt(amountStr);
            }
        }
        return total;
    }

    // Method to parse and display invoice
    static void parseInvoice(String input) {

        // split tasks by comma
        String[] tasks = input.split(",");

        System.out.println("\n--- Invoice Details ---");

        for (String task : tasks) {
            String name = task.replaceAll("[0-9]", "")
                    .replace("INR", "")
                    .replace("-", "")
                    .trim();

            String amount = task.replaceAll("[^0-9]", "");

            System.out.println("Task: " + name + " | Amount: " + amount + " INR");
        }

        int total = getTotalAmount(tasks);
        System.out.println("\nTotal Invoice Amount: " + total + " INR");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bill details: ");
        String input = sc.nextLine();

        parseInvoice(input);
    }
}
