// Base class - Standalone
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("\n----------------------------");
        System.out.println("Employee name is -: " + name);
        System.out.println("Employee ID is -: " + id);
        System.out.println("Employee Salary is -: " + salary);
    }
}

// Manager class - Outside Employee
class Manager extends Employee {
    int teamsize;

    Manager(String name, int id, double salary, int teamsize) {
        super(name, id, salary);
        this.teamsize = teamsize;
    }

    @Override // Good practice to use this
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager | Team Size: " + teamsize);
    }
}

// Developer class - Outside Employee
class Developer extends Employee {
    String language;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer | Language: " + language);
    }
}

// Intern class - Outside Employee
class Intern extends Employee {
    String domain;

    Intern(String name, int id, double salary, String domain) {
        super(name, id, salary);
        this.domain = domain;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern | Domain: " + domain);
    }
}

// Main class to run the code
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e = new Employee("Shivam", 1, 150000);
        Manager m = new Manager("Sarthak", 2, 15000, 5);
        Intern i = new Intern("Madhav", 3, 1500, "Web");

        e.displayDetails();
        m.displayDetails();
        i.displayDetails();
    }
}