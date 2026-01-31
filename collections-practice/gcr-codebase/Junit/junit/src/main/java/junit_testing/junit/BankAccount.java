package junit_testing.junit;

public class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double addMoney(double amount) {
        balance = balance + amount;  
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        balance = balance - amount;   
    }
}
