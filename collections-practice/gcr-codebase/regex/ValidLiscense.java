import java.util.*;
public class ValidLiscense {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();

    System.err.println(str.matches("[A-Z]{2}[0-9]{4}"));
  }
}
