
public class Items {
  String itemCode;
  double price;
  String itemName;

  // constructor
  Items(String itemCode, String itemName, double price) {
    this.itemCode = itemCode;
    this.itemName = itemName;
    this.price = price;
  }

  void displayThings() {
    System.err.println("ItemCode -:" + itemCode);
    System.out.println("Price -:" + price);
    System.out.println("Name -:" + itemName);
    System.out.println("-------------------------------");
    System.err.println("ItemCode -:" + itemCode);
    System.out.println("Price-:" + price);
    System.out.println("Name -:" + itemName);
    System.out.println("-------------------------------");
    System.err.println("ItemCode -:" + itemCode);
    System.out.println("Price-:" + price);
    System.out.println("Name -:" + itemName);

  }

  // making a constructor for calling the display method
  public static void main(String[] args) {
    Items b1 = new Items("01AA", "Water bottle", 500);
    Items b2 = new Items("01BB", "rice", 400);
    Items b3 = new Items("02AA", "blackboard", 700);

    b1.displayThings();
    b2.displayThings();
    b3.displayThings();
  }

}
