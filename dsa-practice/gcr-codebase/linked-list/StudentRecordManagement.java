import java.util.*;

class Student {
  private int rollNumber;
  private String name;
  private int age;
  private String grade;

  Student(int rollNumber, String name, int age, String grade) {
    this.rollNumber = rollNumber;
    this.age = age;
    this.name = name;
    this.grade = grade;
  }

  public int getAge() {
    return age;
  }

  public String getGrade() {
    return grade;
  }

  public String getName() {
    return name;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  // setter
  public void setGrade(String grade) {
    this.grade = grade;
  }
}

public class StudentRecordManagement {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    LinkedList<Student> studentList = new LinkedList<>();

    studentList.addFirst(new Student(1, "Aman", 15, "A+"));
    studentList.add(new Student(2, "Bhuvan", 15, "B+"));
    studentList.addLast(new Student(15, "Shivam", 15, "C+"));

    while (true) {

      System.out.print(
          "\nEnter your choice -: 1 Delete | 2 Search | 3 Display | 4 Update | 0 Exit : ");
      int choice = sc.nextInt();

      // DELETE
      if (choice == 1) {
        System.out.print("Enter roll number to delete: ");
        int rollNumber = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < studentList.size(); i++) {
          if (studentList.get(i).getRollNumber() == rollNumber) {
            studentList.remove(i);
            found = true;
            System.out.println("Record deleted successfully");
            break;
          }
        }

        if (!found) {
          System.out.println("No record found");
        }
      }

      // SEARCH
      else if (choice == 2) {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();

        boolean found = false;
        for (Student student : studentList) {
          if (student.getRollNumber() == roll) {
            System.out.println("Roll no " + student.getRollNumber()
                + " Name " + student.getName()
                + " Age " + student.getAge()
                + " Grade " + student.getGrade());
            found = true;
            break;
          }
        }

        if (!found) {
          System.out.println("No record found");
        }
      }

      // DISPLAY
      else if (choice == 3) {
        for (Student student : studentList) {
          System.out.println("Roll no " + student.getRollNumber()
              + " Name " + student.getName()
              + " Age " + student.getAge()
              + " Grade " + student.getGrade());
        }
      }

      // UPDATE
      else if (choice == 4) {
        System.out.print("Enter roll number to update: ");
        int number = sc.nextInt();

        boolean found = false;
        for (Student student : studentList) {
          if (student.getRollNumber() == number) {

            System.out.println("Before updation...");
            System.out.println("Roll no " + student.getRollNumber()
                + " Name " + student.getName()
                + " Age " + student.getAge()
                + " Grade " + student.getGrade());

            System.out.print("Enter new grade: ");
            String grade = sc.next();

            student.setGrade(grade);

            System.out.println("After updation...");
            System.out.println("Roll no " + student.getRollNumber()
                + " Name " + student.getName()
                + " Age " + student.getAge()
                + " Grade " + student.getGrade());

            found = true;
            break;
          }
        }

        if (!found) {
          System.out.println("No record found");
        }
      }

      // EXIT
      else if (choice == 0) {
        System.out.println("Thanks for visiting.....");
        break;
      }
      // Add
      else if (choice == 5) {
        System.out
            .print("Choose the type of insertion  -: 1 for addfirst | 2 for add at specific index | 3 for add last ");
        int x = sc.nextInt();

        if (x == 1) {
          System.out.print("Enter the data perform add First operation");
          System.out.print("Enter the roll number ");
          int rollNumber = sc.nextInt();
          System.out.print("Enter the roll name ");
          String name = sc.next();
          System.out.print("Enter the roll age ");
          int age = sc.nextInt();
          System.out.print("Enter the grade");
          String grade = sc.next();

          studentList.addFirst(new Student(rollNumber, name, age, grade));
          System.out.println("Data Added successfully");

        } else if (x == 2) {
          System.out.println("Enter the data for add at specific index");
          System.out.print("Enter the roll number ");
          int rollNumber = sc.nextInt();
          System.out.print("Enter the roll name ");
          String name = sc.next();
          System.out.print("Enter the roll age ");
          int age = sc.nextInt();
          System.out.print("Enter the grade");
          String grade = sc.next();
          System.out.print("Enter the index position ");
          int index = sc.nextInt();
          studentList.add(index, new Student(rollNumber, name, age, grade));
          System.out.println("Data Added successfully");
        } else if (x == 3) {
          System.out.println("Enter the data for add Last");
          System.out.print("Enter the roll number ");
          int rollNumber = sc.nextInt();
          System.out.print("Enter the roll name ");
          String name = sc.next();
          System.out.print("Enter the roll age ");
          int age = sc.nextInt();
          System.out.print("Enter the grade");
          String grade = sc.next();
          studentList.addLast(new Student(rollNumber, name, age, grade));
          System.out.println("Data Added successfully");
        } else {
          System.out.println("Please choose form the given position only ");
        }

      }

    }
  }
}
