import java.util.Scanner;

public class FactorsUsingWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int n = sc.nextInt();
    int counter = 1;// counter for finding factors

    // now get the factors using while loop
    while (counter <= n) {
      if (n % counter == 0) {
        System.out.println("The factors of the given number are -: " + counter);
        counter++;
      }
    }
  }

}
