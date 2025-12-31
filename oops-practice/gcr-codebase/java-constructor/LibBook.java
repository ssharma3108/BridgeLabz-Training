public class LibBook {

  public int ISBN;
  protected String title;
  private String author;

  // user setter and getter to set and get the name

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}

// SUBCLASS
class EBook extends LibBook {

  void displayDetails() {
    System.out.println("ISBN -:" + ISBN);
    System.out.println("Title -: " + title);
    System.out.println("Author -: " + getAuthor());
  }

  public static void main(String[] args) {
    EBook ebook = new EBook();

    // public
    ebook.ISBN = 2153;

    // protected (allowed via subclass)
    ebook.title = "Book of Fire";

    // private (via setter)
    ebook.setAuthor("R. K. Sharma");

    ebook.displayDetails();
  }
}
