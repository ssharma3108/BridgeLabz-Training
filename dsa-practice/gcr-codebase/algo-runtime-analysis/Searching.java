public class Searching {

  // method for linear search
  public void linearSearch(int[] arr, int target) {
    boolean isFound = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("Found....");
        isFound = true;
        break;
      }
    }

    if (!isFound) {
      System.out.println("Not found....");
    }
  }

  // method for binary search
  public void binarySearch(int[] arr, int target) {
    boolean isFound = false;
    int left = 0, right = arr.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == target) {
        System.out.println("Found.");
        isFound = true;
        break;
      } else if (arr[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    if (!isFound) {
      System.out.println("Not found........");
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int target = 6;

    Searching s = new Searching();

    s.binarySearch(arr, target);
    s.linearSearch(arr, target);

  }
}
