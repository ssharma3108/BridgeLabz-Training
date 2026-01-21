package smartwarehouse;
import java.util.*;
abstract class WarehouseItem {
  private String name;
  private int quantity;

  WarehouseItem(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  abstract void display();
}

class Electronics extends WarehouseItem {
  Electronics(String name, int quantity) {
    super(name, quantity);
  }

  @Override
  void display() {
    System.out.println("Electronics: " + getName() + ", Qty: " + getQuantity());
  }
}

class Groceries extends WarehouseItem {
  Groceries(String name, int quantity) {
    super(name, quantity);
  }

  @Override
  void display() {
    System.out.println("Groceries: " + getName() + ", Qty: " + getQuantity());
  }
}

class Furniture extends WarehouseItem {
  Furniture(String name, int quantity) {
    super(name, quantity);
  }

  @Override
  void display() {
    System.out.println("Furniture: " + getName() + ", Qty: " + getQuantity());
  }
}

class Storage<T extends WarehouseItem> {
  private List<T> items = new ArrayList<>();

  public void addItem(T item) {
    items.add(item);
  }

  public List<T> getItems() {
    return items;
  }
}

class WarehouseUtil {
  public static void displayAllItems(List<? extends WarehouseItem> items) {
    for (WarehouseItem item : items) {
      item.display();
    }
  }
}
