package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount bankAccount = new BankAccount(0);

    @Test
    public void addMoneyTest() {
        double balance = bankAccount.addMoney(200);

        assertEquals(200, balance);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    public void withdrawTest() {
        bankAccount.addMoney(500);
        bankAccount.withdraw(200);

        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    public void withdrawInsufficientBalanceTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(100);
        });
    }
}
