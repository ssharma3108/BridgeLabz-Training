package onlinemarket;

import java.util.*;

/* ---------- GENERIC PRODUCT CLASS ---------- */
class Product<T extends Category> {
  private String name;
  private double price;
  private T category;

  Product(String name, double price, T category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public T getCategory() {
    return category;
  }

  public void display() {
    System.out.println(
        "Product: " + name +
            ", Price: " + price +
            ", Category: " + category.getCategoryName());
  }
}

/* ---------- GENERIC CATALOG ---------- */
class Catalog {
  private List<Product<? extends Category>> products = new ArrayList<>();

  public void addProduct(Product<? extends Category> product) {
    products.add(product);
  }

  public void showCatalog() {
    for (Product<? extends Category> p : products) {
      p.display();
    }
  }
}

/* ---------- GENERIC METHOD (DISCOUNT) ---------- */
class DiscountService {
  public static <T extends Product<? extends Category>> void applyDiscount(
      T product, double percentage) {

    double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);

    product.setPrice(discountedPrice);
  }
}
