// Interface
interface Discountable {

  double applyDiscount();

  void getDiscountDetails();
}

// Abstract class
abstract class FoodItem {

  private String itemName;
  private double price;
  private int quantity;

  FoodItem(String itemName, double price, int quantity) {
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
  }

  // abstract method
  abstract double calculateTotalPrice();

  // getters
  public String getItemName() {
    return itemName;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  void getItemDetails() {
    System.out.println("Item Name : " + itemName);
    System.out.println("Price     : " + price);
    System.out.println("Quantity  : " + quantity);
  }
}

// ---------------- VEG ITEM ----------------
class VegItem extends FoodItem implements Discountable {

  private int discount; // percentage

  VegItem(String itemName, double price, int quantity) {
    super(itemName, price, quantity);
    this.discount = 12; // 12% discount
  }

  @Override
  public double applyDiscount() {
    return (getPrice() * getQuantity()) * discount / 100;
  }

  @Override
  public void getDiscountDetails() {
    System.out.println("Discount Applied : " + discount + "%");
  }

  @Override
  double calculateTotalPrice() {
    double total = getPrice() * getQuantity();
    return total - applyDiscount();
  }

  @Override
  void getItemDetails() {
    super.getItemDetails();
    getDiscountDetails();
    System.out.println("Discount Amount : " + applyDiscount());
    System.out.println("Final Price     : " + calculateTotalPrice());
  }
}

// ---------------- NON-VEG ITEM ----------------
class NonVeg extends FoodItem implements Discountable {

  private int discount; // smaller discount

  NonVeg(String itemName, double price, int quantity) {
    super(itemName, price, quantity);
    this.discount = 5; // 5% discount
  }

  @Override
  public double applyDiscount() {
    return (getPrice() * getQuantity()) * discount / 100;
  }

  @Override
  public void getDiscountDetails() {
    System.out.println("Discount Applied : " + discount + "%");
  }

  @Override
  double calculateTotalPrice() {
    double total = getPrice() * getQuantity();
    return total - applyDiscount();
  }

  @Override
  void getItemDetails() {
    super.getItemDetails();
    getDiscountDetails();
    System.out.println("Discount Amount : " + applyDiscount());
    System.out.println("Final Price     : " + calculateTotalPrice());
  }
}

// ---------------- MAIN CLASS ----------------
public class OnlineFood {

  public static void main(String[] args) {

    FoodItem veg = new VegItem("Paneer Butter Masala", 250, 2);
    FoodItem nonVeg = new NonVeg("Chicken Curry", 350, 1);

    System.out.println("----- Veg Item -----");
    veg.getItemDetails();

    System.out.println("\n----- Non-Veg Item -----");
    nonVeg.getItemDetails();
  }
}
