import java.util.*;

public class Employee {

  String name;
  int id;
  int salary;

  // NON-static method
  void displayDetails(String name, int id, int salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;

    System.out.println("Name: " + this.name);
    System.out.println("ID: " + this.id);
    System.out.println("Salary: " + this.salary);
  }

  public static void main(String[] args) {

    Employee emp = new Employee();
    emp.displayDetails("Rohan", 1, 500000);
  }
}