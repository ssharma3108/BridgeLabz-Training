public class Student {

  // access modifiers
  static String universityName;
  String name;
  String grade;
  final int rollNumber;

  static int totalEnroll = 0;

  // constructor
  Student(String universityName, String name, String grade, int rollNumber) {
    Student.universityName = universityName;
    this.name = name;
    this.grade = grade;
    this.rollNumber = rollNumber;
    totalEnroll++;
  }

  // display total students
  public static void displayTotalStudents() {
    System.out.println("Total no of students -: " + totalEnroll);
  }

  // display student details
  public static void displayDetails(Student s) {
    System.out.println("University Name -: " + universityName);
    System.out.println("Roll no -: " + s.rollNumber);
    System.out.println("Name -: " + s.name);
    System.out.println("Grade -: " + s.grade);
  }

  // main method
  public static void main(String[] args) {

    Student s1 = new Student("Global University", "Shiva", "A", 101);
    displayDetails(s1);

    displayTotalStudents();
  }
}
