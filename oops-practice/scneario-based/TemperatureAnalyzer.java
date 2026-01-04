import java.util.Scanner;

public class TemperatureAnalyzer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float[][] temperature = new float[7][24];

    float hottest = Float.MIN_VALUE;
    float coldest = Float.MAX_VALUE;

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 24; j++) {
        temperature[i][j] = sc.nextFloat();
      }
    }

    // for getting the hottest and coldest temperature

    for (int i = 0; i < temperature.length; i++) {
      for (int j = 0; j < temperature.length; j++) {
        if (hottest < temperature[i][j]) {
          hottest = temperature[i][j];
        }
        if (coldest > temperature[i][j]) {
          coldest = temperature[i][j];
        }
      }
    }

    int[] data = new int[7];
    int total = 0;
    double avg = 0;

    for (int i = 0; i < temperature.length; i++) {
      total = 0; // reset for each day

      for (int j = 0; j < 24; j++) {
        total += temperature[i][j];
      }

      avg = (double) total / 24; // average of one day
      data[i] = (int) avg; // store average of day i
    }

    // now print the average of all days
    for (int i = 0; i < data.length; i++) {
      System.out.println("The average of day " + (i + 1) + " is -: " + data[i]);
    }

    // for printing the hottest and coldest temperature
    System.out.println("The coldest temperature is " + coldest);
    System.out.println("The hottest temperature is " + hottest);

  }
}
