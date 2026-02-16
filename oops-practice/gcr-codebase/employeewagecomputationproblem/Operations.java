package employeewagecomputationproblem;

import java.awt.Choice;
import java.util.Random;


public class Operations {

public String checkAttendence() {
	String [] attendenceStrings= {"Present","Absent"};
	Random random=new Random();
	
	int length=random.nextInt(attendenceStrings.length);
	
	String choiceString =attendenceStrings[length];
	
	return choiceString;	
}

//check the type of the employee
public int typeOfEmployee(int choice) {
	String[] typeStrings = {"FullTime", "PartTime"};
	
	if (choice == 1) {
		System.out.println("Employee is " + typeStrings[0]);
		return 1;
	} else if (choice == 2) {
		System.out.println("Employee is " + typeStrings[1]);
		return 2;
	} else {
		System.out.println("Invalid Choice");
		System.exit(0);
		return 0; // unreachable but required
	}
}

public void calculateWage() {
	int wagePerHour = 20;
	int wageFullHour = 8;
	int partTimeHour = 8;   // (kept as you wrote)
	int workingDays = 20;
	
	double total = 0;
	
	int type = typeOfEmployee(1);
	
	if (type == 1) {
		total = wageFullHour * wagePerHour;
	} else if (type == 2) {
		total = wagePerHour * partTimeHour;
	}
	
	System.out.println(total);
}

	
}
