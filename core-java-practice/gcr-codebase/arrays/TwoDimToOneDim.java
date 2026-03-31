import java.util.*;

public class TwoDimToOneDim {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int rows = sc.nextInt();
    int column = sc.nextInt();
    int[][] arr = new int[rows][column];

    int[] result = new int[rows * column]; // to store the answer in one dimentional

    // take input and store input in the 2D array
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < column; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // now convert it into 1D array
    int k = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < column; j++) {
        result[k] = arr[i][j];
        k++;
      }
    }

    // print the output
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + "");
    }

  }
}
