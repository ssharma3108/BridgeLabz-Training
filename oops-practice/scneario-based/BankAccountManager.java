import java.util.Scanner;

interface update {
  void updateBalance();
}

abstract class Bank {
  private long accountNumber;
  protected int balance;

  Bank(long accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  // getter
  public long getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  void getDetails() {
    System.out.println("Account Number -: " + accountNumber);
    System.out.println("CurrentBalance -: " + balance);
  }

}

class Deposit extends Bank implements update {
  private int amount;

  Deposit(long accountNumber, int balance, int amount) {
    super(accountNumber, balance);
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public void updateBalance() {
    balance = balance + amount;
    System.out.println("Updated Balance -: " + balance);
  }

  void getDetails() {
    super.getDetails();
    updateBalance();
    System.out.println("Money addded successfully....");
  }
}

class Withdraw extends Bank implements update {
  private int amount;

  Withdraw(long accountNumber, int balance, int amount) {
    super(accountNumber, balance);
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public void updateBalance() {
    if (amount > getBalance()) {
      System.out.println("Insufficient Balance.....");
    } else {
      System.out.println("Withdrawl Amount " + amount);
      balance = balance - amount;
      System.out.println("Updated Balance -: " + balance);
    }
  }

  void getDetails() {
    super.getDetails();
    updateBalance();
    System.out.println("Money Withdrawl successfully....");
  }

}

class CheckBalance extends Bank {

  CheckBalance(long accountNumber, int balance) {
    super(accountNumber, balance);
  }

  void getDetails() {
    super.getDetails();
  }

}

public class BankAccountManager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long accountNumber = 1234567890;
    int balance = 15000;

    while (true) {
      System.out.print(
          "Choose the type of operation to perform -: 1 for Deposit | 2 for Withdrawl | 3 for check Balance | 4 for exit -: ");
      int choice = sc.nextInt();

      if (choice == 1) {
        // deposit
        System.out.print("Enter the amount -:");
        int amount = sc.nextInt();

        Deposit d = new Deposit(accountNumber, balance, amount);
        d.getDetails();

        balance = d.getBalance(); // for update the balance....

      } else if (choice == 2) {
        // withdrawl
        System.out.print("Enter the amount to withdrawl -: ");
        int amount = sc.nextInt();

        Withdraw w = new Withdraw(accountNumber, balance, amount);
        w.getDetails();

        balance = w.getBalance(); // update

      } else if (choice == 3) {
        // check balance
        CheckBalance c = new CheckBalance(accountNumber, balance);
        c.getDetails();
      } else if (choice == 4) {
        System.err.println("Thanks for visiting........");
        return;
      } else {
        System.out.println("Invalid Input....");
        return;
      }

    }

  }
}
