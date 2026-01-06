// Interface for reservable items
interface Reservable {
  void reserveItem();

  void checkAvailability();
}

// Abstract class
abstract class LibraryItem {

  private int itemId;
  private String title;
  private String author;

  LibraryItem(int itemId, String title, String author) {
    this.itemId = itemId;
    this.title = title;
    this.author = author;
  }

  // getters and setters (encapsulation)
  public int getItemId() {
    return itemId;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  // abstract method
  abstract int getLoanDuration();

  void getItemDetails() {
    System.out.println("Item ID  : " + itemId);
    System.out.println("Title    : " + title);
    System.out.println("Author   : " + author);
  }
}

// ---------------- BOOK ----------------
class Book extends LibraryItem implements Reservable {

  private boolean reserved;

  Book(int itemId, String title, String author) {
    super(itemId, title, author);
    this.reserved = false;
  }

  @Override
  public void checkAvailability() {
    System.out.println(reserved ? "Book is already reserved." : "Book is available.");
  }

  @Override
  public void reserveItem() {
    if (!reserved) {
      reserved = true;
      System.out.println("Book reserved successfully.");
    } else {
      System.out.println("Book is already reserved.");
    }
  }

  @Override
  int getLoanDuration() {
    return 14; // 14 days for books
  }
}

// ---------------- MAGAZINE ----------------
class Magazine extends LibraryItem implements Reservable {

  private boolean reserved;

  Magazine(int itemId, String title, String author) {
    super(itemId, title, author);
    this.reserved = false;
  }

  @Override
  public void checkAvailability() {
    System.out.println(reserved ? "Magazine is already reserved." : "Magazine is available.");
  }

  @Override
  public void reserveItem() {
    if (!reserved) {
      reserved = true;
      System.out.println("Magazine reserved successfully.");
    } else {
      System.out.println("Magazine is already reserved.");
    }
  }

  @Override
  int getLoanDuration() {
    return 7; // 7 days for magazines
  }
}

// ---------------- DVD ----------------
class DVD extends LibraryItem implements Reservable {

  private boolean reserved;

  DVD(int itemId, String title, String author) {
    super(itemId, title, author);
    this.reserved = false;
  }

  @Override
  public void checkAvailability() {
    System.out.println(reserved ? "DVD is already reserved." : "DVD is available.");
  }

  @Override
  public void reserveItem() {
    if (!reserved) {
      reserved = true;
      System.out.println("DVD reserved successfully.");
    } else {
      System.out.println("DVD is already reserved.");
    }
  }

  @Override
  int getLoanDuration() {
    return 3; // 3 days for DVDs
  }
}

// ---------------- MAIN CLASS ----------------
public class LibraryManagementSystem {

  public static void main(String[] args) {

    // Polymorphism: parent reference
    LibraryItem[] items = {
        new Book(1, "Java Programming", "Herbert Schildt"),
        new Magazine(2, "Tech Today", "Editorial Team"),
        new DVD(3, "Inception", "Christopher Nolan")
    };

    for (LibraryItem item : items) {
      System.out.println("\n-----------------------");
      item.getItemDetails();
      System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

      if (item instanceof Reservable) {
        Reservable r = (Reservable) item;
        r.checkAvailability();
        r.reserveItem();
        r.checkAvailability();
      }
    }
  }
}
