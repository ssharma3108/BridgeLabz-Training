import java.util.Scanner;

public class CountdownUsingForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();

    // use for loop for decrement
    for (int i = number; i >= 0; i--) {
      System.out.println(i);
    }

  }

}
