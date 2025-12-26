import java.util.*;

public class Scorecard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // b. Generate PCM scores
        int[][] pcmMarks = generatePCMScores(n);

        // c. Calculate total, average, percentage
        double[][] results = calculateResults(pcmMarks);

        // d. Display scorecard
        displayScoreCard(pcmMarks, results);

        input.close();
    }

    // b. Generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int) (Math.random() * 100); // Physics
            marks[i][1] = (int) (Math.random() * 100); // Chemistry
            marks[i][2] = (int) (Math.random() * 100); // Maths
        }
        return marks;
    }

    // c. Calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            // Round off to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // d. Display scorecard
    public static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {

            String grade = getGrade(result[i][2]);

            System.out.printf(
                    "%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    grade);
        }
    }

    // Grade calculation
    public static String getGrade(double percentage) {

        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }
}
