import java.util.*;

public class MultiplicationTableRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user..
    int[] arr = new int[4];
    int index = 0;
    int number = sc.nextInt(); // take the number as input from the user

    // print the table
    for (int i = 6; i <= 9; i++) {
      arr[index] = number * i;
      index++;
    }

    // display the output
    index = 0;
    for (int i = 6; i <= 9; i++) {
      System.out.println(number + " * " + i + " = " + arr[index]);
      index++;
    }
  }
}