package factoryRobotHazardAnalyzer;

import java.util.Scanner;

class FactoryRobot {

  public double calculateHazardRisk(double armprecesion, int workerDensity, String machineryState)
      throws RobotsafetyException {
    if (armprecesion < 0.0 || armprecesion > 1.0) {
      throw new RobotsafetyException("Error: Arm precision must be 0.0-1.0");
    }

    if (workerDensity < 1 || workerDensity > 20) {
      throw new RobotsafetyException("Error:Worker density must be 1-20");
    }

    if (!machineryState.equals("Worn") || !machineryState.equals("Faulty") || !machineryState.equals("Critical")) {
      throw new RobotsafetyException("Error: Unsupported machinery state");
    }

    double machineRisk = 0;
    if (machineryState.equals("Worn")) {
      machineRisk = 1.3;
    } else if (machineryState.equals("Faulty")) {
      machineRisk = 2.0;
    } else if (machineryState.equals("Critical")) {
      machineRisk = 3.0;
    }

    double hazardRisk = ((1.0 - armprecesion) * 15.0) + (workerDensity * machineRisk);

    return hazardRisk;

  }

}

public class Main {
  public static void main(String[] args) throws RobotsafetyException {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Arm Precision (0.0 - 1.0) : ");
    double precision = sc.nextDouble();

    System.out.print("Enter Worker Density (1 - 20): ");
    int density = sc.nextInt();

    System.out.print("Enter Machinery State (Worn/Faulty/Critical) : ");
    String state = sc.next();

    FactoryRobot factoryRobot = new FactoryRobot();

    double result = factoryRobot.calculateHazardRisk(precision, density, state);

    System.out.println(result);

  }
}