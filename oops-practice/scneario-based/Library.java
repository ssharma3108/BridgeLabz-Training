import java.util.*;

class Book {
  private String title;
  private String author;
  private String status;

  Book(String title, String author, String status) {
    this.title = title;
    this.author = author;
    this.status = status;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public String getStatus() {
    return status;
  }
}

public class Library {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Book> book = new ArrayList<>();

    book.add(new Book("wings on fire", "shivam sharma", "available"));

    System.out.println("Welcome to Library.......");

    while (true) {
      System.out.println("\nPress 1: Add  2: Search  3: Display  4: Exit");
      int choice = sc.nextInt();
      sc.nextLine();
      // for add
      if (choice == 1) {
        System.out.print("Enter the title of the book -: ");
        String ti = sc.nextLine();
        System.out.print("Enter the author of the book -: ");
        String a = sc.nextLine();
        String status = "available";
        book.add(new Book(ti, a, status));
      } else if (choice == 2) { // for search
        System.out.print("Enter the title of the book to search -: ");
        String t = sc.nextLine();
        boolean found = false;
        for (Book b : book) {
          if (b.getTitle().equalsIgnoreCase(t)) {
            System.out.println("The book is found: " + b.getTitle() + " | Author: " + b.getAuthor());
            found = true;
            break;
          }
        }
        if (!found) {
          System.out.println("Not found........");
        }
      } else if (choice == 3) { // for display
        for (Book b : book) {
          System.out.println(
              "Book title -: " + b.getTitle() + " | Author -: " + b.getAuthor() + " | Status -: " + b.getStatus());
        }
      } else if (choice == 4) { // for exit
        System.out.println("Thank you");
        break;
      }
    }
  }
}