import java.util.Scanner;

public class FizzBuzzUsingWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking using input
    int n = sc.nextInt();
    int counter = 1; // set a counter for check divisiblity
    // now run while loop and print the output accourding to question

    while (n >= counter) {
      if (counter % 3 == 0 && counter % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (counter % 3 == 0) {
        System.out.println("Fizz");
      } else if (counter % 5 == 0) {
        System.out.println("Buzz");
      } else { // for the condition when the number is not divisible bt both 3 and 5
        System.out.println(counter);
      }
      counter++; // increase the counter
    }

  }

}
