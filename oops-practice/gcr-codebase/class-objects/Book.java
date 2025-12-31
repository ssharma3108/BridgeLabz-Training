public class Book {
  String title;
  String author;
  double price;

  // constructor
  Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  void displayThings() {
    System.err.println("Title of the book -:" + title);
    System.out.println("Author of the book -:" + author);
    System.out.println("Price of the book -:" + price);
    System.err.println("Title of the book -:" + title);
    System.out.println("Author of the book -:" + author);
    System.out.println("Price of the book -:" + price);

  }

  // making a constructor for calling the display method
  public static void main(String[] args) {
    Book b1 = new Book("2States", "Chetan Bhagat", 500);
    Book b2 = new Book("Wings Of Fire", "Abdul kalam.A.P.J", 500);

    b1.displayThings();
    b2.displayThings();
  }

}
