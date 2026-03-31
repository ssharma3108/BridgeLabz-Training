import java.util.Scanner;

public class ChillWind {

  static void calculateWind(double temperature, double windspeed) {

    double result = 35.74 + 0.6125 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windspeed, 0.16);

    System.out.println(result);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    double temperature = sc.nextDouble();
    double windspeed = sc.nextDouble();

    // calculate
    calculateWind(temperature, windspeed);

  }
}
