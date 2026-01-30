import java.util.*;
public class HexCode {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();


    System.out.println(str.matches("^[#][0-9A-Fa-f]{6}"));

  }
}
