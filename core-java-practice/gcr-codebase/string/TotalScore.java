import java.util.*;

public class TotalScore {

  static String[] subjects = { "Physics", "Chemistry", "Math" };
  static int[] marks = new int[3];

  // for generating the random score
  static void randomScore() {
    Random random = new Random();
    for (int i = 0; i < 3; i++) {
      marks[i] = random.nextInt(90) + 10;
    }
  }

  // store the marks in a 2D array
  static String[][] marksAndSubject(int[] marks, String[] subjects) {
    String[][] overall = new String[subjects.length][2];

    for (int i = 0; i < overall.length; i++) {
      overall[i][0] = subjects[i];
      overall[i][1] = Integer.toString(marks[i]);
    }
    return overall;
  }

  // calculate total, percentage and grade
  static void calculateScore(int[] marks) {
    int total = 0;

    for (int mark : marks) {
      total += mark;
    }

    double percentage = (total / 300.0) * 100;
    double average = total / 3.0;

    System.out.println("Total Marks: " + total);
    System.out.println("Percentage: " + percentage);
    System.out.println("Average: " + average);

    if (percentage >= 90) {
      System.out.println("Grade: A");
    } else if (percentage >= 80) {
      System.out.println("Grade: B");
    } else if (percentage >= 70) {
      System.out.println("Grade: C");
    } else if (percentage >= 60) {
      System.out.println("Grade: D");
    } else if (percentage >= 50) {
      System.out.println("Grade: E");
    } else {
      System.out.println("Grade: R");
    }
  }

  // display marks table
  static void displayTable(String[][] table) {
    System.out.println("\nSubject\t\tMarks");
    System.out.println("-----------------------");
    for (String[] row : table) {
      System.out.println(row[0] + "\t\t" + row[1]);
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the name of the student: ");
    String name = sc.nextLine();

    randomScore();

    String[][] table = marksAndSubject(marks, subjects);

    System.out.println("\nStudent Name: " + name);
    displayTable(table);

    calculateScore(marks);
  }
}