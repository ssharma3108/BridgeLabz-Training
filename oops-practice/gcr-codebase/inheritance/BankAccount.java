class Bank {
    double accountNumber;
    int balance;

    Bank(double accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Account Number -: " + accountNumber);
        System.out.println("Balance is -: " + balance);
    }

    // SavingAccount class
    class SavingAccount extends Bank {
        int interestRate;

        SavingAccount(double accountNumber, int balance, int interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        @Override
        void displayAccountType() {
            super.displayAccountType();
            System.out.println("This is Saving Account");
            System.out.println("Interest rate is -: " + interestRate);
        }
    }

    // CheckingAccount class
    class CheckingAccount extends Bank {
        int withdrawalLimit;

        CheckingAccount(double accountNumber, int balance, int withdrawalLimit) {
            super(accountNumber, balance);
            this.withdrawalLimit = withdrawalLimit;
        }

        @Override
        void displayAccountType() {
            super.displayAccountType();
            System.out.println("This is Checking Account");
            System.out.println("Withdrawal limit is -: " + withdrawalLimit);
        }
    }

    // FixedDeposit class
    class FixedDeposit extends Bank {
        FixedDeposit(double accountNumber, int balance) {
            super(accountNumber, balance);
        }

        @Override
        void displayAccountType() {
            super.displayAccountType();
            System.out.println("This is Fixed Deposit Account");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank(977246, 500000);
        Bank.SavingAccount s = bank.new SavingAccount(123001, 200000, 5);
        Bank.CheckingAccount c = bank.new CheckingAccount(123002, 100000, 50000);
        Bank.FixedDeposit f = bank.new FixedDeposit(123003, 300000);

        System.out.println("----- Saving Account -----");
        s.displayAccountType();

        System.out.println("----- Checking Account -----");
        c.displayAccountType();

        System.out.println("----- Fixed Deposit -----");
        f.displayAccountType();
    }
}
