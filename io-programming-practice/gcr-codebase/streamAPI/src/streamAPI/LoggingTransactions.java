package streamAPI;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class LoggingTransactions {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("TXN101", "TXN102", "TXN103");

        list.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
