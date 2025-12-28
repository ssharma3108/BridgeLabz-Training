import java.util.*;

public class LuckyDraw {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user

    // running a loop and the check if the number is divisible by 3 and 5 and for
    // exit press 0......
    while (true) {
      System.out.print("Hello sir, Please enter your number -:");
      int n = sc.nextInt();
      if (n % 5 == 0 && n % 3 == 0 && n != 0) {
        System.out.println("Congratulation 🎉 you won a lucky draw !!!!!!!!");
      } else if (n == 0) {
        System.out.println("Lucky Draw ended.\r\n" + //
            "Thank you for visiting the Diwali Mela 🎆");
        break;
      } else if (n < 0) {
        System.out.println("Invalid input. Please enter a positive number");
      } else {
        System.out.println("Sorry, no gift this time.");
      }
    }

  }
}
