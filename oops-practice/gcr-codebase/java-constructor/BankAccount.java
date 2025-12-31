public class BankAccount {

  // access modifiers
  public int accountNumber;
  protected String accountHolder;
  private int balance;

  // getter and setter details
  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }
}

// subclass
class SavingsAccount extends BankAccount {

  void displayDetails() {

    System.out.println("Account Number -: " + accountNumber);
    System.out.println("Account Holder -: " + accountHolder);

  }

  public static void main(String[] args) {
    SavingsAccount saving = new SavingsAccount();
    saving.accountNumber = 123456;
    saving.accountHolder = "Shivam";

    saving.displayDetails();
  }
}
