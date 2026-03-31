import java.util.Scanner;

public class PercentageAndGrade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input as same as subject wise
    System.out.print("Enter the physics marks");
    int physics = sc.nextInt();
    System.out.print("Enter the chemistry marks");
    int chemistry = sc.nextInt();
    System.out.print("Enter the math marks");
    int math = sc.nextInt();

    // calcualte percentage and assign grade
    int total = ((physics + chemistry + math) / 300) * 100;

    // now assign grade accourding to percentage
    if (total >= 80) {
      System.out.println("youar Grade is A and marks in percentage are " + total);
    } else if (total >= 70 && total <= 79) {
      System.err.println("your grade is B and marks in percentage are " + total);
    } else if (total >= 60 && total <= 69) {
      System.err.println("your grade is c and marks in percentage are " + total);
    } else if (total >= 50 && total <= 59) {
      System.err.println("your grade is D and marks in percentage are " + total);
    } else if (total >= 40 && total <= 49) {
      System.err.println("your grade is E and marks in percentage are " + total);
    } else {
      System.out.println("your grade is R and marks in percentage are " + total);
    }
  }

}
