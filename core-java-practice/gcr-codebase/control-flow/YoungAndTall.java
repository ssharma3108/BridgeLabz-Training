import java.util.Scanner;

public class YoungAndTall {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user of height and ages
    System.out.println("Enter the age of Amar,Akbar and Anthony");
    int amarAge = sc.nextInt();
    int akbarAge = sc.nextInt();
    int anthonyAge = sc.nextInt();

    System.out.println("Enter the height of Amar,Akbar and Anthony");
    int amarHeight = sc.nextInt();
    int akbarHeight = sc.nextInt();
    int anthonyHeight = sc.nextInt();

    // checking for smallest Age........
    if (amarAge < akbarAge && amarAge < anthonyAge) {
      System.out.println("The smallest Age amoung three is Amar ");
    } else if (amarAge > akbarAge && amarAge < anthonyAge) {
      System.out.println("The smallest Age amoung three is Akbar");
    } else {
      System.out.println("The smallest Age amoung three is Anthony");
    }

    // checking for the Tallest height height
    if (amarHeight < akbarHeight && akbarHeight < anthonyHeight) {
      System.out.println("The Largest height amoung three is Anthony ");
    } else if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
      System.out.println("The Largest height amoung three is Amar");
    } else {
      System.out.println("The Largest height amoung three is  Amar");
    }

  }

}
