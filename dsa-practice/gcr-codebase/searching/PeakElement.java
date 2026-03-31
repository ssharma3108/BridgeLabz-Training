public class PeakElement {
  public static void main(String[] args) {
    int[] arr = { 15, 18, 2, 3, 6, 12 };

    int peakPoint = arr[0];
    int index = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > peakPoint) {
        peakPoint = arr[i];
        index = i;
      }
    }

    System.out.println("peak Point -: " + peakPoint);
    System.out.println("Index -: " + index);

  }

}
