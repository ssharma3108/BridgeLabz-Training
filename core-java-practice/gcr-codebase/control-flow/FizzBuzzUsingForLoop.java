import java.util.Scanner;

public class FizzBuzzUsingForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking using input
    int n = sc.nextInt();

    // now run for loop and print the output accourding to question
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else { // for the condition when the number is not divisible bt both 3 and 5
        System.out.println(i);
      }
    }

  }

}
