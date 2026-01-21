import java.util.ArrayList;
import java.util.List;
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


public class SmartWarehourseManagement {
  public static void main(String[] args) {

    Storage<Electronics> electronicsStorage = new Storage<>();
    electronicsStorage.addItem(new Electronics("Laptop", 10));
    electronicsStorage.addItem(new Electronics("Mobile", 20));

    Storage<Groceries> groceriesStorage = new Storage<>();
    groceriesStorage.addItem(new Groceries("Rice", 50));
    groceriesStorage.addItem(new Groceries("Sugar", 30));

    Storage<Furniture> furnitureStorage = new Storage<>();
    furnitureStorage.addItem(new Furniture("Chair", 15));
    furnitureStorage.addItem(new Furniture("Table", 5));

    System.out.println("---- Electronics ----");
    WarehouseUtil.displayAllItems(electronicsStorage.getItems());

    System.out.println("---- Groceries ----");
    WarehouseUtil.displayAllItems(groceriesStorage.getItems());

    System.out.println("---- Furniture ----");
    WarehouseUtil.displayAllItems(furnitureStorage.getItems());
  }
}
