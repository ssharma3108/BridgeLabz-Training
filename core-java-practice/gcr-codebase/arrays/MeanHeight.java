import java.util.Scanner;

public class MeanHeight {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // taking array input from the user
    double[] height = new double[11];

    // put the elements from the user
    for (int index = 0; index <= height.length; index++) {
      height[index] = sc.nextDouble();
    }

    int sum = 0;
    // calculate the sum
    for (int i = 0; i <= height.length; i++) {
      sum += height[i];
    }
    double mean = sum / 11;

    System.out.println("The mean height of the football team is " + mean);

  }

}
