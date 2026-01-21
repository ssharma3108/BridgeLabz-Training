package coursemanagement;
import java.util.*;
public class Main {
  public static void main(String[] args) {

    List<ExamBased> examCourses = new ArrayList<>();
    examCourses.add(new ExamBased("Exam-Based"));

    List<AssignmentBased> assignmentCourses = new ArrayList<>();
    assignmentCourses.add(new AssignmentBased("Assignment-Based"));

    CourseManager.displayCourses(examCourses);
    CourseManager.displayCourses(assignmentCourses);

  }
}