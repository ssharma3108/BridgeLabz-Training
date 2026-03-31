public class ProfitAndLoss {
  public static void main(String[] args) {
    int cost=129;
    int selling=191;

//calculate the profit
int profit=selling-cost;

//now calculate the percentage...
double percentage=(profit/cost)*100;

System.out.println("The Cost Price is INR"+cost+"and Selling Price is INR"+selling);
System.out.println("The Profit is INR"+profit+"and the Profit Percentage is"+percentage);

  }

}
