package functionalInterface;

// Custom marker interface
interface SensitiveData {
}

// Sensitive class
class BankAccount implements SensitiveData {

    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class EncryptionSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(123456, 50000);

        if (account instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Encrypting...");
        } else {
            System.out.println("No encryption required");
        }
    }
}
