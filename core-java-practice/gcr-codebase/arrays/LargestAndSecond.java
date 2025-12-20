import java.util.*;

public class LargestAndSecond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int n = sc.nextInt();
    int[] arr = new int[n];

    // storing input
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    // print the largest and second largest
    System.out.println(
        "The largest numeber is " + arr[arr.length - 1] + " and second largest number is " + arr[arr.length - 2]);

  }
}