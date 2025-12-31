
public class MobilePhone {
  String brand;
  double price;
  String model;

  // constructor
  MobilePhone(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  void displayThings() {
    System.err.println("brand -:" + brand);
    System.out.println("Price -:" + price);
    System.out.println("Name -:" + model);
    System.out.println("-------------------------------");
    System.err.println("brand -:" + brand);
    System.out.println("Price-:" + price);
    System.out.println("Name -:" + model);
    System.out.println("-------------------------------");
    System.err.println("brand -:" + brand);
    System.out.println("Price-:" + price);
    System.out.println("Name -:" + model);

  }

  // making a constructor for calling the display method
  public static void main(String[] args) {
    MobilePhone b1 = new MobilePhone("VIVO", "VIVO29", 15000);
    MobilePhone b2 = new MobilePhone("Apple", "Iphone17", 40000);
    MobilePhone b3 = new MobilePhone("OnePhone", "nord64", 70000);

    b1.displayThings();
    b2.displayThings();
    b3.displayThings();
  }

}
