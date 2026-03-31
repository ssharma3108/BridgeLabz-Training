import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] result = new String[n]; // to store the result

    // now run for loop and print the output accourding to question
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result[i - 1] = "FizzBuzz";
      } else if (i % 3 == 0) {
        result[i - 1] = "Fizz";
      } else if (i % 5 == 0) {
        result[i - 1] = "Bizz";
      } else { // for the condition when the number is not divisible bt both 3 and 5
        result[i - 1] = "Nothing";
      }
    }

    // now print the result
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i] + " ,");
    }

  }

}
