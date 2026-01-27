import java.security.InvalidParameterException;
import java.util.InputMismatchException;

public class UncheckedException {
  public static void main(String[] args) {
    try {
      int a = 10;
      int b = 0;

      int result = a / b;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Error Occured " + e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Error Occured " + e.getMessage());
    }
  }
}
