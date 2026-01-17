public class SearchIn2D {
  public static void main(String[] args) {
    int[][] Matrix = {
        { 1, 3, 5, 7 },
        { 10, 11, 16, 20 },
        { 23, 30, 34, 60 }
    };

    int target = 16;
    boolean isFound = false;

    for (int i = 0; i < Matrix.length; i++) {
      for (int j = 0; j < Matrix.length; j++) {
        if (Matrix[i][j] == target) {
          isFound = true;
          break;
        }
      }
    }

    if (isFound) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

  }
}
