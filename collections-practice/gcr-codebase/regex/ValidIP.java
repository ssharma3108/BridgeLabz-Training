import java.util.*;

public class ValidIP {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    String regex = "^(25[0-5]|2[0-4][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[1-9]?[0-9])$";

    System.out.print(s.matches(regex));

  }
}
