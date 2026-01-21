public class CountPositive {
  public static void main(String[] args) {
    int[] arr = { -2, 4, -1, 6, 0 };
    int count = 0;

    for (int num : arr) {
      if (num > 0) {
        count++;
      }
    }

    System.out.println("Positive numbers count: " + count);
  }
}
