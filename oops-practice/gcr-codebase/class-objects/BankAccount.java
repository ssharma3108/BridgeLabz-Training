import java.util.*;

public class BankAccount {

  static int accountHolder=0;
  static int accountNumber=0;
  static int balance=0;

  static int depositMoney(int amount) {
    balance = balance + amount;

    return balance;
  }

  static void withDrawMoney(int withdrawAmount) {
    if(balance>withdrawAmount){
      balance=balance-withdrawAmount;
      System.out.println(balance);
    }else{
      System.out.println("Not Sufficient Amount");
    }
  }

  static int displayCurrentBalance() {
    return balance;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Current balance -:"+ balance);
    int amount = sc.nextInt();

    System.out.println("Deposit Amount "+amount);
    System.out.println("Curent Balance "+depositMoney(amount));

 int withdrawAmount=sc.nextInt();
 System.out.println("Withdrwal amount "+withdrawAmount);
withDrawMoney(withdrawAmount);

  }

}
