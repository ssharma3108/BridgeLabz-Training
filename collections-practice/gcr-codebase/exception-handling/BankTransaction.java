import java.util.Scanner;

class InsufficientBalanceException extends Exception {
  InsufficientBalanceException(String s) {
    super(s);
  }
}

public class BankTransaction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = 15000;

    try {
      System.out.print("Enter the withdeawl Amount ");
      int withdeawl = sc.nextInt();

      if (withdeawl < 0) {
        throw new IllegalArgumentException("Please enter positive amount");
      }

      if (withdeawl > amount) {
        throw new InsufficientBalanceException("Insufficient balance!");
      }

      System.out.println("Withdrawl successful......");
      System.out.println("Current Balance -: " + (amount - withdeawl));

    } catch (Exception e) {
      System.out.println("Error -: " + e.getMessage());
    }

  }
}
