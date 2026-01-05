import java.util.Scanner;

public class LibraryManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of books -: ");
    int n = sc.nextInt();
    sc.nextLine(); // consume leftover newline

    String[][] books = new String[n][3];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter details of book " + (i + 1));

      System.out.print("Title: ");
      books[i][0] = sc.nextLine();

      System.out.print("Author: ");
      books[i][1] = sc.nextLine();

      System.out.print("Status: ");
      books[i][2] = sc.nextLine();
    }

    System.out.println("==============================");
    System.out.println("Enter 1 to display the books ");
    System.out.println("Enter 2 to Search the books ");
    System.out.println("Enter 3 to update the books ");
    System.out.println("==============================");

    System.out.println("Enter the user input -: ");
    int input = sc.nextInt();

    // for display
    if (input == 1) {
      System.out.println("Available Books in Library:\r\n" + //
          "------------------------------------------------");
      for (int i = 0; i < books.length; i++) {
        for (int j = 0; j < books.length; j++) {
          System.out.println(books[i][0]);
        }
      }
    }

  }
}
