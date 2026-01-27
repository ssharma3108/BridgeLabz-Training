
class InvalidAgeException extends Exception {
  InvalidAgeException(String s) {
    super(s);
  }
}

public class CustomException {
  public static void main(String[] args) {
    int age = 15;
    try {

      if (age < 18) {
        throw new InvalidAgeException("Age is invalid");
      }
      System.out.println("You can vote");

    } catch (Exception e) {
      System.out.println("Error Occured " + e.getMessage());
    }
  }
}
