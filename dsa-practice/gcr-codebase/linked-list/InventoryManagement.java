import java.util.Scanner;

/* ================= Inventory Class ================= */
class Inventory {
  private String itemName;
  private int itemId;
  private int quantity;

  Inventory(String itemName, int itemId, int quantity) {
    this.itemName = itemName;
    this.itemId = itemId;
    this.quantity = quantity;
  }

  public int getItemId() {
    return itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}

/* ================= Node Class ================= */
class Node {
  Inventory data;
  Node next;

  Node(Inventory data) {
    this.data = data;
    this.next = null;
  }
}

/* ================= Singly Linked List ================= */
class InventoryLinkedList {
  private Node head;

  // Add at beginning
  void addBegin(Inventory inventory) {
    Node newNode = new Node(inventory);
    newNode.next = head;
    head = newNode;
    System.out.println("Item added at beginning");
  }

  // Add at last
  void addLast(Inventory inventory) {
    Node newNode = new Node(inventory);

    if (head == null) {
      head = newNode;
      System.out.println("Item added at last");
      return;
    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    System.out.println("Item added at last");
  }

  // Add at specific position (1-based index)
  void addPosition(Inventory inventory, int position) {
    if (position <= 0) {
      System.out.println("Invalid position");
      return;
    }

    if (position == 1) {
      addBegin(inventory);
      return;
    }

    Node newNode = new Node(inventory);
    Node temp = head;

    for (int i = 1; i < position - 1 && temp != null; i++) {
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println("Position out of range");
      return;
    }

    newNode.next = temp.next;
    temp.next = newNode;
    System.out.println("Item added at position " + position);
  }

  // Remove item by ID
  void removeItem(int id) {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    if (head.data.getItemId() == id) {
      head = head.next;
      System.out.println("Item removed successfully");
      return;
    }

    Node temp = head;
    while (temp.next != null && temp.next.data.getItemId() != id) {
      temp = temp.next;
    }

    if (temp.next == null) {
      System.out.println("Item not found");
    } else {
      temp.next = temp.next.next;
      System.out.println("Item removed successfully");
    }
  }

  // Update quantity
  void update(int id, int newQuantity) {
    Node temp = head;
    while (temp != null) {
      if (temp.data.getItemId() == id) {
        temp.data.setQuantity(newQuantity);
        System.out.println("Quantity updated successfully");
        return;
      }
      temp = temp.next;
    }
    System.out.println("Item not found");
  }

  // Search item
  void searchItem(int id, String name) {
    Node temp = head;
    while (temp != null) {
      if (temp.data.getItemId() == id &&
          temp.data.getItemName().equalsIgnoreCase(name)) {
        System.out.println("Item found: "
            + temp.data.getItemName()
            + " | Quantity: "
            + temp.data.getQuantity());
        return;
      }
      temp = temp.next;
    }
    System.out.println("Item not found");
  }

  // Display all items and total inventory value
  void calculateDisplay() {
    int total = 0;
    Node temp = head;

    // Calculate total value (price assumed = 12 per item)
    while (temp != null) {
      total += temp.data.getQuantity() * 12;
      temp = temp.next;
    }

    temp = head;
    while (temp != null) {
      System.out.println(
          "ID: " + temp.data.getItemId() +
              " Name: " + temp.data.getItemName() +
              " Quantity: " + temp.data.getQuantity() +
              " | Total Inventory Value: " + total);
      temp = temp.next;
    }
  }
}

/* ================= Main Class ================= */
public class InventoryManagement {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    InventoryLinkedList inventory = new InventoryLinkedList();

    // Initial records
    inventory.addLast(new Inventory("Rice", 1, 12));
    inventory.addLast(new Inventory("Shirt", 2, 3));
    inventory.addLast(new Inventory("Shoes", 3, 2));
    inventory.addLast(new Inventory("Mobile", 4, 1));

    while (true) {
      System.out.println("\n1 Add  2 Delete  3 Search  4 Display  5 Update  0 Exit");
      int choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.println("1 Add First | 2 Add Last | 3 Add At Position");
          int type = sc.nextInt();

          System.out.print("Item Name: ");
          String name = sc.next();
          System.out.print("Item ID: ");
          int id = sc.nextInt();
          System.out.print("Quantity: ");
          int qty = sc.nextInt();

          Inventory item = new Inventory(name, id, qty);

          if (type == 1)
            inventory.addBegin(item);
          else if (type == 2)
            inventory.addLast(item);
          else if (type == 3) {
            System.out.print("Enter position: ");
            int pos = sc.nextInt();
            inventory.addPosition(item, pos);
          }
          break;

        case 2:
          System.out.print("Enter item ID to delete: ");
          inventory.removeItem(sc.nextInt());
          break;

        case 3:
          System.out.print("Enter item ID: ");
          int sid = sc.nextInt();
          System.out.print("Enter item name: ");
          String sname = sc.next();
          inventory.searchItem(sid, sname);
          break;

        case 4:
          inventory.calculateDisplay();
          break;

        case 5:
          System.out.print("Enter item ID: ");
          int uid = sc.nextInt();
          System.out.print("Enter new quantity: ");
          int newQty = sc.nextInt();
          inventory.update(uid, newQty);
          break;

        case 0:
          System.out.println("Thank you!");
          return;

        default:
          System.out.println("Invalid choice");
      }
    }
  }
}
