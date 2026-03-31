import java.util.Scanner;

public class TotalPrice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    System.out.print("Enter the item unit price");
    double unitPrice = sc.nextDouble();
    System.out.print("Enter the quantity");
    double quantity = sc.nextDouble();

    // calculate the total price
    double total = unitPrice * quantity;

    System.out.println(" The total purchase price is INR " + total + " if the quantity " + quantity
        + " and unit price is INR " + unitPrice);
  }

}
