import java.util.Scanner;

public class NestedTryCatch {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Enter array size: ");
      int n = sc.nextInt();

      int[] array = new int[n];

      System.out.println("Enter array elements:");
      for (int i = 0; i < n; i++) {
        array[i] = sc.nextInt();
      }

      System.out.print("Enter index to access: ");
      int index = sc.nextInt();

      System.out.print("Enter divisor: ");
      int div = sc.nextInt();

      try {
        int result = array[index] / div;
        System.out.println("Result: " + result);

      } catch (ArithmeticException e) {
        System.out.println("Error: Divisor cannot be zero");
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Invalid array index");
    }

    sc.close();
  }
}
