package multithreading;

import java.time.LocalDateTime;

class Transaction implements Runnable {

    private String customerName;
    private double amount;
    private BankAccount account;

    public Transaction(String customerName, double amount, BankAccount account) {
        this.customerName = customerName;
        this.amount = amount;
        this.account = account;
    }

    @Override
    public void run() {

        System.out.println("[" + Thread.currentThread().getName() +
                "] Attempting to withdraw " + amount);

        boolean success = account.withdraw(customerName, amount);

        if (!success) {
            System.out.println("Transaction failed: " + customerName +
                    ", Amount: " + amount +
                    ", Time: " + LocalDateTime.now());
        }
    }
}
class BankAccount {

    private double balance = 10000;

    // synchronized to prevent race condition
    public synchronized boolean withdraw(String customerName, double amount) {

        if (balance >= amount) {

            try {
                Thread.sleep(500); // simulate ATM delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println("Transaction successful: " + customerName +
                    ", Amount: " + amount +
                    ", Balance: " + balance);

            return true;
        }
        return false;
    }
}
public class BankingSystem {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction("Customer-1", 3000, account), "Customer-1");
        Thread t2 = new Thread(new Transaction("Customer-2", 4000, account), "Customer-2");
        Thread t3 = new Thread(new Transaction("Customer-3", 2000, account), "Customer-3");
        Thread t4 = new Thread(new Transaction("Customer-4", 5000, account), "Customer-4");
        Thread t5 = new Thread(new Transaction("Customer-5", 1500, account), "Customer-5");

        // Display thread state before start
        System.out.println("Thread State before start:");
        System.out.println(t1.getName() + " - " + t1.getState());
        System.out.println(t2.getName() + " - " + t2.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("All transactions processed");
    }
}