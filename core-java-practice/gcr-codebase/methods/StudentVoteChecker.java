import java.util.*;

public class StudentVoteChecker {

  public boolean canStudentVote(int age) {
    if (age < 0) {
      return false;
    }
    if (age >= 18) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StudentVoteChecker checker = new StudentVoteChecker();

    int[] ages = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter age of student " + (i + 1) + ": ");
      ages[i] = input.nextInt();

      boolean canVote = checker.canStudentVote(ages[i]);

      if (canVote) {
        System.out.println("Student can vote");
      } else {
        System.out.println("Student cannot vote");
      }
      input.close();
    }
  }
}
