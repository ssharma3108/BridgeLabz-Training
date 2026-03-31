import java.util.*;

public class StudentCanVote {

  static String[][] checkVote(int[] students) {
    String[][] vote = new String[students.length][2];
    for (int i = 0; i < students.length; i++) {
      // store age
      vote[i][0] = Integer.toString(students[i]);
      // check voting eligibility
      if (students[i] >= 18) {
        vote[i][1] = "Can Vote";
      } else {
        vote[i][1] = "Cannot Vote";
      }
    }
    return vote;
  }

  static void displayTable(String[][] vote) {

    System.out.println("Age\tVoting Status");
    System.out.println("--------------------");

    for (int i = 0; i < vote.length; i++) {
      System.out.println(vote[i][0] + "\t" + vote[i][1]);
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] students = new int[10];

    System.out.println("Enter ages of 10 students:");
    for (int i = 0; i < students.length; i++) {
      students[i] = sc.nextInt();
    }

    // get 2D array
    String[][] voteTable = checkVote(students);

    // display in tabular form
    displayTable(voteTable);
  }
}