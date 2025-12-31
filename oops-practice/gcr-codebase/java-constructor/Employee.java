public class Employee {
  // access modifiers
  public int employeeId;
  protected String department;
  private int salary;

  // getter and setter details
  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getsalary() {
    return salary;
  }
}

// subclass
class Manager extends Employee {

  void displayDetails() {

    System.out.println("Account Number -: " + employeeId);
    System.out.println("Account Holder -: " + department);

  }

  public static void main(String[] args) {
    Manager saving = new Manager();
    saving.employeeId = 123456;
    saving.department = "Development";

    saving.displayDetails();
  }
}
