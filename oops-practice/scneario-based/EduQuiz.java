import java.util.*;

public class EduQuiz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] answer = { "A", "C", "B", "D", "A", "B", "C", "D", "A", "C" };
    String[] studentAnswer = new String[10];

    // for taking input from the user
    System.out.println("Enter all the answers");
    for (int i = 0; i < studentAnswer.length; i++) {
      studentAnswer[i] = sc.next();
    }

    int total = 0;
    // now match the answers
    if (answer.length < 10) {
      System.out.println("Invalid Inputs");
      return;
    }
    for (int i = 0; i < studentAnswer.length; i++) {
      if (answer[i].equals(studentAnswer[i])) {
        total++;
      } else {
        i++;
      }
    }

    // now calculate the result
    double Percentage = (double) total / 10 * 100;
    System.out.println("Total correct answers -: " + total + " out of 10");
    System.err.println("Percentage -: " + Percentage + " %");
    System.out.println();
    if (Percentage > 50) {
      System.out.println("Result -: PASS");
    } else {
      System.out.println("Result -: FAIL");
    }
  }
}
