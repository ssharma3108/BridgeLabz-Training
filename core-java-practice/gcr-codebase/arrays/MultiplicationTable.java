import java.util.*;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking user input
    int n = sc.nextInt();

    // print the table until it reach to n
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println(i + " * " + j + " = " + i * j);
      }
      System.out.println("=====================");
    }

  }

}
