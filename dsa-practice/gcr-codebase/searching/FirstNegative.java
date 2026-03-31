
public class FirstNegative {
  public static void main(String[] args) {
    int[] arr = { 5, 1, 8, -1, 2, -8, 4 };

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        System.out.println("The index of first Negative number is -: " + i);
        break;
      }
    }

  }
}
