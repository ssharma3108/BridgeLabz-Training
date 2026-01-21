import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
  private String type;

  CourseType(String type) {
    this.type = type;

  }

  public String getType() {
    return type;
  }
}

class ExamBased extends CourseType {

  ExamBased(String type) {
    super(type);
  }

}

class AssignmentBased extends CourseType {

  AssignmentBased(String type) {
    super(type);
  }

}

class ResearchBased extends CourseType {

  ResearchBased(String type) {
    super(type);
  }

}

// generic
class Course<T extends CourseType> {
  String courseName;
  int courseCode;
  String department;
  T evaluationType;
}

// wildcards
class CourseManager {
  public static void displayCourses(List<? extends CourseType> courses) {

    for (CourseType courseType : courses) {
      System.out.println("Evaluation Type: " + courseType.getType());
    }
  }
}

public class CourseManagementSystem {
  public static void main(String[] args) {

    List<ExamBased> examCourses = new ArrayList<>();
    examCourses.add(new ExamBased("Exam-Based"));

    List<AssignmentBased> assignmentCourses = new ArrayList<>();
    assignmentCourses.add(new AssignmentBased("Assignment-Based"));

    CourseManager.displayCourses(examCourses);
    CourseManager.displayCourses(assignmentCourses);

  }
}
