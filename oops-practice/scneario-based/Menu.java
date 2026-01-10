import java.util.*;

public class Menu {

  // display the menu
  static void displayMenu(String[] item) {
    for (int i = 1; i < 11; i++) {
      System.out.println(i + " " + item[i]);
    }
  }

  // get item
  static void getItemById(String[] item, int number) {
    System.out.println("The Ordered Item is -: " + item[number - 1]);
  }

  // main
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] foodItems = {
        "Pizza", "Burger", "Pasta", "Sushi", "Taco",
        "Salad", "Steak", "Ramen", "Dosa", "Sandwich", "Pav Bhaji"
    };

    displayMenu(foodItems);

    System.out.print("Enter the index no. -: ");
    int number = sc.nextInt();
    getItemById(foodItems, number);

  }
}
