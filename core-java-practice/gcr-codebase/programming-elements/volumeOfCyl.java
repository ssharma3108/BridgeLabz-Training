import java.util.Scanner;

public class volumeOfCyl {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int radius=sc.nextInt();
    int height=sc.nextInt();

//calculate the volume 3.14*r*r*h
double result=3.14*radius*radius*height;

System.out.println("The area of the cylinder is ----->"+result);
  }

}
