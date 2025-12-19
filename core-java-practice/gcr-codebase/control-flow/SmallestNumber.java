import java.util.Scanner;

public class SmallestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();

    // compare for checking whether the first number is smallest among given all or
    // not
    if (number1 < number2 && number1 < number3) {
      System.out.println("Yes, the first number is smallest");
    } else {
      System.out.println("No, the first number is not smallest");
    }

  }

}
