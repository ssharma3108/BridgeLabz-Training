public class CountEven {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 6 };
    int count = 0;

    for (int num : arr) {
      if (num % 2 == 0) {
        count++;
      }
    }

    System.out.println("Even numbers count: " + count);
  }
}
