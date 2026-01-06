
public class MoveZeros {
  public static void main(String[] args) {
    int[] arr = { 0, 2, 7, 0, 8, 2, 4 };
    int left = 0;
    for (int right = 0; right < arr.length; right++) {
      if (arr[right] != 0) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
      }
    }
    for (int index = 0; index < arr.length; index++) {
      System.out.println(arr[index]);
    }
  }
}
