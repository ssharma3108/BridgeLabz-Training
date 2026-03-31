import java.util.*;

// Base Class
class Account {
    String accountNumber;
    String holderName;
    double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        return false;
    }
}

// Savings Account
class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        double total = amount + 2;

        if (balance - total < 0) {
            return false;
        }

        balance -= total;
        return true;
    }
}

// Current Account
class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        double total = amount + 5;

        if (balance - total < -10000) {
            return false;
        }

        balance -= total;
        return true;
    }
}

// Business Account
class BusinessAccount extends Account {

    public BusinessAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public boolean withdraw(double amount) {

        double charge = amount * 0.01;
        double total = amount + charge;

        if (balance - total < -50000) {
            return false;
        }

        balance -= total;
        return true;
    }
}

// Bank Manager
class BankManager {

    List<Account> accounts = new ArrayList<>();

    public void createAccount(String accountNumber, String holderName, String accountType, double initialBalance) {

        if (accountType.equals("SavingsAccount")) {
            accounts.add(new SavingsAccount(accountNumber, holderName, initialBalance));
        } else if (accountType.equals("CurrentAccount")) {
            accounts.add(new CurrentAccount(accountNumber, holderName, initialBalance));
        } else if (accountType.equals("BusinessAccount")) {
            accounts.add(new BusinessAccount(accountNumber, holderName, initialBalance));
        }
    }

    public void deposit(String accountNumber, double amount) {

        boolean isFound = false;

        for (Account a : accounts) {
            if (a.accountNumber.equals(accountNumber)) {
                a.deposit(amount);
                System.out.println("Deposited Successfully");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Account Not Found");
        }
    }

    public void withdraw(String accountNumber, double amount) {

        boolean isFound = false;

        for (Account a : accounts) {
            if (a.accountNumber.equals(accountNumber)) {

                if (a.withdraw(amount)) {
                    System.out.println("Withdrawal Successful");
                } else {
                    System.out.println("Insufficient Funds");
                }

                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Account Not Found");
        }
    }
}

// Main Class
class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        BankManager bankManager = new BankManager();

        for (int i = 0; i < n; i++) {

            String str = sc.nextLine();
            String[] s = str.split(" ");

            String command = s[0];

            if (command.equals("Create")) {

                String id = s[1];
                String name = s[2];
                String type = s[3];
                double amount = Double.parseDouble(s[4]);

                bankManager.createAccount(id, name, type, amount);
                System.out.println("Account Created: " + id);

            } else if (command.equals("Withdraw")) {

                String id = s[1];
                double amount = Double.parseDouble(s[2]);

                bankManager.withdraw(id, amount);

            } else if (command.equals("Deposit")) {

                String id = s[1];
                double amount = Double.parseDouble(s[2]);

                bankManager.deposit(id, amount);
            }
        }

        sc.close();
    }
}