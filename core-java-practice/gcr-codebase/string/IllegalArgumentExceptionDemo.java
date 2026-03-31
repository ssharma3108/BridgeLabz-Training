import java.util.*;

public class IllegalArgumentExceptionDemo {
  // this is for generate exception
  public static void generateException(String str) {

    System.err.println(str.substring(5, 3));
  }

  // this is for caught the illegal argument
  public static void handleIllegalArgumentException(String str) {

    try {
      System.err.println(str.substring(5, 3));

    } catch (IllegalArgumentException e) {
      System.out.println(" IllegalArgumentException caught");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    String str = sc.next();
    try {
      generateException(str);
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("IllegalArgumentException occur");
    }
    handleIllegalArgumentException(str);
  }
}
