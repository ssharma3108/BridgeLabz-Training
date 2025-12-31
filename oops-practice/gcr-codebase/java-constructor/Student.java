public class Student {

  // access modifiers
  public int rollNumber;
  protected String name;
  private double cgpa;

  // public setter for CGPA
  public void setCGPA(double cgpa) {
    this.cgpa = cgpa;
  }

  // public getter for CGPA
  public double getCGPA() {
    return cgpa;
  }
}

class PostgraduateStudent extends Student {

  // method to demonstrate protected access
  void displayStudentDetails() {
    System.out.println("Roll Number: " + rollNumber); // public
    System.out.println("Name: " + name); // protected
    System.out.println("CGPA: " + getCGPA()); // private via public method
  }

  public static void main(String[] args) {

    PostgraduateStudent pg = new PostgraduateStudent();

    // accessing public member
    pg.rollNumber = 101;

    // accessing protected member (allowed in subclass)
    pg.name = "Amit";

    // accessing private member using public method
    pg.setCGPA(8.7);

    // display all details
    pg.displayStudentDetails();
  }
}
