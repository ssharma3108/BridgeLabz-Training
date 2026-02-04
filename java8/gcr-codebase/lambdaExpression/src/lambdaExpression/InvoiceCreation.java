package lambdaExpression;
import java.util.*;
import java.util.function.Function;

// Invoice class
class Invoice {
    private int transactionId;

    // Constructor
    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    public void printInvoice() {
        System.out.println("Invoice created for Transaction ID: " + transactionId);
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        // List of transaction IDs
        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        // Constructor reference
        Function<Integer, Invoice> invoiceCreator = Invoice::new;

        // Generate invoices
        List<Invoice> invoices = new ArrayList<>();
        for (int id : transactionIds) {
            invoices.add(invoiceCreator.apply(id));
        }

        // Print invoices
        invoices.forEach(Invoice::printInvoice);
    }
}
