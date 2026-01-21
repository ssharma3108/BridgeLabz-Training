package coursemanagement;

import java.util.ArrayList;
import java.util.List;

abstract class CourseManagementSystem {
  private String type;

  CourseManagementSystem(String type) {
    this.type = type;

  }

  public String getType() {
    return type;
  }
}

class ExamBased extends CourseManagementSystem {

  ExamBased(String type) {
    super(type);
  }

}

class AssignmentBased extends CourseManagementSystem {

  AssignmentBased(String type) {
    super(type);
  }

}

class ResearchBased extends CourseManagementSystem {

  ResearchBased(String type) {
    super(type);
  }

}

// generic
class Course<T extends CourseManagementSystem> {
  String courseName;
  int courseCode;
  String department;
  T evaluationType;
}
