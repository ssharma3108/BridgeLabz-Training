public class DiscountFee {
  public static void main(String[] args) {
    int fee = 125000;
    int discountPercent = 10;

    // calculate the discount.....
    int discount = (fee * discountPercent) / 100;

    // calculate the payable amount..........
    int pay = fee - discount;

    // print output
    System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + pay);

  }

}
