import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //taking input
    int n=sc.nextInt();
    double result=0;

    //now do calculation for check the armstrong
    int number=n;
    while (number!=0) {
      int rem=number%10;
      result=result+Math.pow(rem, 3);
      number=number/10;
    }

    //now print the answer
    System.out.println(result==n);

  }

}
