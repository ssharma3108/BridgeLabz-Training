import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    int salary;


    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class Serialization{
    public static void main(String[] args) {
        Employee e=new Employee(1,"Shivam","Computer-Science",15000);
        try {
            FileOutputStream fs=new FileOutputStream("data.txt");
            ObjectOutput ou=new ObjectOutputStream(fs);

            ou.writeObject(e);
            ou.close();

            System.out.println("Data written to file");

            //now desearise the data
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("data.txt"));

            Employee emp=(Employee) in.readObject();

            System.out.println("Employee Details:");
            System.out.println("ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Department: " + emp.department);
            System.out.println("Salary: " + emp.salary);



        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}