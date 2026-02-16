package employeewagecomputationproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Welcome to Employee Wage Computation Program");
	
	List<Company> list= new ArrayList<Company>();
	

	while(true) {
		System.out.print("Enter company name : ");
		String nameString =scanner.next();
		System.out.print("Enter Wage Per Hour: ");
		int wage=scanner.nextInt();
		System.out.print("Enter Working Days: ");
		int wrokingDays=scanner.nextInt();
		System.out.print("Enter Max Working Hours: ");
		int maxHour=scanner.nextInt();
		
		
		list.add(new Company(nameString, wage, wrokingDays, wrokingDays));
		
		System.out.println("Company Added successfully !!");
		
	}
	

}
}
