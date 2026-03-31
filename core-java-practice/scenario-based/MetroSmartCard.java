import java.util.*;

public class MetroSmartCard {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int total = 200;
    System.out.println("Smart Card Balance -: ₹" + total);

    while (true) {
      // taking distance input from the user
      System.out.print("Enter the distance in Km -:");
      int distance = sc.nextInt();

      int deduction = 3 * distance; // let assume per km charge is 3 rupees

      // check for the balance
      if (deduction <= total) {
        System.out.println("Thank you for booking !!!!");
        total = total - deduction;
        System.out.println("Your remaining card balance is " + total);
      } else {
        System.out.println("Your card balance is low !!!!");
      }

    }

  }
}
