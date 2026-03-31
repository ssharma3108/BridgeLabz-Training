
public class Bonus {

    public static void main(String[] args) {

        // Step 1: Generate salary and years of service
        double[][] employeeData = generateEmployeeData();

        // Step 2: Calculate new salary and bonus
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display results and totals
        displaySalaryDetails(employeeData, updatedData);
    }

    // b. Generate salary & years of service
    // Column 0 -> Old Salary
    // Column 1 -> Years of Service
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int) (Math.random() * 10) + 1; // 1 to 10 years
        }
        return data;
    }

    // c. Calculate bonus and new salary
    // Column 0 -> New Salary
    // Column 1 -> Bonus Amount
    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] result = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][1] = bonus;
            result[i][0] = salary + bonus;
        }
        return result;
    }

    // d. Display table and totals
    public static void displaySalaryDetails(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp  OldSalary  Years  Bonus   NewSalary");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < 10; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%2d   %.0f     %.0f    %.0f    %.0f\n", (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);
    }
}
