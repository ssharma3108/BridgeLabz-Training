import java.util.*;

public class Challenge {
  public static void main(String[] args) {

    int[] arr = { 3, 4, -1, 1 };
    int target = 3;

    int n = arr.length;
    boolean[] present = new boolean[n + 1];

    // Mark positive numbers
    for (int i = 0; i < n; i++) {
      if (arr[i] > 0 && arr[i] <= n) {
        present[arr[i]] = true;
      }
    }

    int missing = 1;
    for (int i = 1; i <= n; i++) {
      if (!present[i]) {
        missing = i;
        break;
      }
    }

    System.out.println("First missing positive integer: " + missing);

    Arrays.sort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));

    int left = 0, right = arr.length - 1;
    int index = -1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] == target) {
        index = mid;
        break;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    System.out.println("Target index: " + index);
  }
}
