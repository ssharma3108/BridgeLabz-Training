import java.util.*;

public class PowerCalculation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double power = sc.nextInt();
    double exponent = sc.nextInt();

    // calculate the power using math.power built in function
    double result = Math.pow(power, exponent);

    System.out.println(result);

  }

}
