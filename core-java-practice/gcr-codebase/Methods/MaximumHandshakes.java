import java.util.*;

public class MaximumHandshakes {

  // making a method that calculate the maximum number of handshakes
  static void maximumHadshakes(int numberOfStudents) {
    // calculate the maximum no of handshakes...
    int result = (numberOfStudents * (numberOfStudents - 1)) / 2;

    // print the result
    System.out.println("The number of possible handshakes " + result);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int numberOfStudents = sc.nextInt();

    maximumHadshakes(numberOfStudents);

  }
}
