import java.util.Scanner;

public class DiscountFeeClg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    System.out.print("Enter the fee ->");
    int fee = sc.nextInt();
    System.out.print("Enter the discount in % ->");
    int discount = sc.nextInt();

    // calculate the discount.....
    int perc = (fee * discount) / 100;

    // calculate the payable amount..........
    int pay = fee - perc;

    // print output
    System.out.println("The discount amount is INR " + perc + " and final discounted fee is INR " + pay);

  }

}
