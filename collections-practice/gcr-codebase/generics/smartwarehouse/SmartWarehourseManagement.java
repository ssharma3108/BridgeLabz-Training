package smartwarehouse;

import java.util.ArrayList;
import java.util.List;

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
