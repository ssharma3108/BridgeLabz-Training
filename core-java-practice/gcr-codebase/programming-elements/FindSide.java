import java.util.Scanner;

public class FindSide {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double perimeter=sc.nextDouble();

    //now find the side
    double side = perimeter/4.0;

    //now print the output
    System.out.println("The length of the side is "+ side+" whose perimeter is "+ perimeter);

  }

}
