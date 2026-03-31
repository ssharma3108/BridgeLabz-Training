import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfThreeNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number -:");
    int a = sc.nextInt();
    System.out.print("Enter second number -:");
    int b = sc.nextInt();
    System.out.print("Enter third number -:");
    int c = sc.nextInt();

    // storing numbers in array
    int[] arr = new int[3];
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;

    // sort the array and print the last element from it
    Arrays.sort(arr);
    System.out.println("The highest number is -:" + arr[2]);

  }
}
