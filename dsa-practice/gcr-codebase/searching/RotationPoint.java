
public class RotationPoint {
  public static void main(String[] args) {
    int[] arr = { 15, 18, 2, 3, 6, 12 };

    int rotationPoint = arr[0];
    int index = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < rotationPoint) {
        rotationPoint = arr[i];
        index = i;
      }
    }

    System.out.println("Rotation Point -: " + rotationPoint);
    System.out.println("Index -: " + index);

  }

}
