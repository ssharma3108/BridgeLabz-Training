package employeewagecomputationproblem;

import java.util.Random;

public class Operations {

	private static final int FULL_TIME = 1;
	private static final int PART_TIME = 2;

	public void calculateWage(Company company) {

		int totalHours = 0;
		int totalDays = 0;
		int totalWage = 0;

		Random random = new Random();

		while (totalHours < company.getMaxWorkingHours() &&
			   totalDays < company.getWorkingDays()) {

			totalDays++;

			int empType = random.nextInt(3); // 0,1,2
			int empHours = 0;

			switch (empType) {
			case FULL_TIME:
				empHours = 8;
				break;
			case PART_TIME:
				empHours = 4;
				break;
			default:
				empHours = 0;
			}

			totalHours += empHours;

			int dailyWage = empHours * company.getWagePerHour();
			company.getDailyWageList().add(dailyWage);

			totalWage += dailyWage;
		}

		company.setTotalWage(totalWage);
	}

	public int getTotalWageByCompanyName(String name, java.util.List<Company> list) {

		for (Company company : list) {
			if (company.getCompanyName().equalsIgnoreCase(name)) {
				return company.getTotalWage();
			}
		}

		return -1; // company not found
	}
}
