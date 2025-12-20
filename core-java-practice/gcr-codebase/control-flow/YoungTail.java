import java.util.*;

public class YoungTail {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking age from the user
    int[] age = new int[3];

    // now taking height form the user
    int[] height = new int[3];

    // checking for smallest Age........
    if (age[0] < age[1] && age[0] < age[2]) {
      System.out.println("The smallest Age amoung three is Amar ");
    } else if (age[0] > age[1] && age[0] < age[2]) {
      System.out.println("The smallest Age amoung three is Akbar");
    } else {
      System.out.println("The smallest Age amoung three is Anthony");
    }

    // checking for the Tallest height height
    if (height[0] < height[1] && height[1] < height[2]) {
      System.out.println("The Largest height amoung three is Anthony ");
    } else if (height[0] > height[1] && height[0] > height[2]) {
      System.out.println("The Largest height amoung three is Amar");
    } else {
      System.out.println("The Largest height amoung three is  Amar");
    }

  }

}
