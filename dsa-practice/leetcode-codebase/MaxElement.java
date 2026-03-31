public class MaxElement {
  public static void main(String[] args) {
    int[] arr = { 3, 9, 2, 8, 4 };
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("Maximum element: " + max);
  }
}
