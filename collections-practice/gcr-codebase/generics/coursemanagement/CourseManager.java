package coursemanagement;

import java.util.*;

// wildcards
class CourseManager {
  public static void displayCourses(List<? extends CourseManagementSystem> courses) {

    for (CourseManagementSystem courseType : courses) {
      System.out.println("Evaluation Type: " + courseType.getType());
    }
  }
}