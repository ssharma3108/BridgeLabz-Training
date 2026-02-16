package employeewagecomputationproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Employee Wage Computation Program");

		List<Company> list = new ArrayList<>();
		Operations operations = new Operations();

		// Add Companies
		while (true) {

			System.out.print("Enter your choice - 1 to Add Company | 2 to Stop: ");
			int choice = scanner.nextInt();

			if (choice == 1) {

				System.out.print("Enter Company Name: ");
				String name = scanner.next();

				System.out.print("Enter Wage Per Hour: ");
				int wage = scanner.nextInt();

				System.out.print("Enter Working Days: ");
				int days = scanner.nextInt();

				System.out.print("Enter Max Working Hours: ");
				int maxHours = scanner.nextInt();

				list.add(new Company(name, wage, days, maxHours));

				System.out.println("Company Added Successfully!\n");

			} else if (choice == 2) {
				break;
			} else {
				System.out.println("Invalid Choice");
			}
		}

		// Calculate Wage For Each Company
		for (Company company : list) {

			operations.calculateWage(company);

			System.out.println("\nCompany: " + company.getCompanyName());
			System.out.println("Daily Wages: " + company.getDailyWageList());
			System.out.println("Total Wage: " + company.getTotalWage());
		}

		// Query Wage By Company Name (UC14)
		System.out.print("\nEnter Company Name to Get Total Wage: ");
		String searchName = scanner.next();

		int total = operations.getTotalWageByCompanyName(searchName, list);

		if (total != -1) {
			System.out.println("Total Wage of " + searchName + " = " + total);
		} else {
			System.out.println("Company Not Found");
		}

		System.out.println("\nThank You");
	}
}
