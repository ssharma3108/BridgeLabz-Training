package employeewagecomputationproblem;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String companyName;
	private int wagePerHour;
	private int workingDays;
	private int maxWorkingHours;
	private int totalWage;
	private List<Integer> dailyWageList;

	public Company(String companyName, int wagePerHour, int workingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.dailyWageList = new ArrayList<>();
	}

	// Getters
	public String getCompanyName() {
		return companyName;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public int getMaxWorkingHours() {
		return maxWorkingHours;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public List<Integer> getDailyWageList() {
		return dailyWageList;
	}
}
