import java.util.*;

public class SimpleIntrest {

  // making a method to calculate the SI
  static void calculateSimpleIntrest(double principal, double rate, int time) {

    // now calculate the SI (pricipal*rate*time)/100
    double result = (principal * rate * time) / 100;

    System.out.println("The Simple Intrest is " + result + " for principal " + principal + " ,Rate of Intrest " + rate
        + " ,Time" + time);
  }

  // main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    double principal = sc.nextDouble();
    double rate = sc.nextDouble();
    int time = sc.nextInt();

    calculateSimpleIntrest(principal, rate, time);
  }
}
