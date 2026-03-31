import java.util.Scanner;

public class FindBonus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    System.out.print("Enter Your Salary");
    double salary = sc.nextInt();
    System.out.println("Enter the year of Service");
    int service = sc.nextInt();

    // give a bonus of 5% to employees whose year of service is more than 5
    if (service > 5) {
      salary = salary * 0.05;
    }
    System.out.println(salary);
  }

}
