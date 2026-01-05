// Interface
interface Department {
    void assignDepartment(String dept);

    void getDepartmentDetails();
}

// Abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    private int baseSalary;

    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("Employee ID      : " + employeeId);
        System.out.println("Employee Name    : " + name);
        System.out.println("Final Salary     : " + calculateSalary());
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return getBaseSalary(); // Fixed salary
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department       : " + department);
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Full Time Employee ---");
        super.displayDetails();
        getDepartmentDetails();
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private int ratePerHour;
    private String department;

    public PartTimeEmployee(int employeeId, String name, int hoursWorked, int ratePerHour) {
        super(employeeId, name, 0); // baseSalary not used
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department       : " + department);
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Part Time Employee ---");
        super.displayDetails();
        getDepartmentDetails();
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1, "Shivam", 40000);
        Employee e2 = new PartTimeEmployee(2, "Sharma", 6, 500);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        e1.displayDetails();
        e2.displayDetails();
    }
}
