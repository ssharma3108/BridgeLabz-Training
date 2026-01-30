import java.util.Scanner;

public class ValidUsername {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    System.out.println(str.matches("^[A-Za-z][A-Za-z0-9_]{5,15}$"));

  }
}
