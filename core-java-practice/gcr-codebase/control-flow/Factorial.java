import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //taking input from the user
    int n=sc.nextInt();
    int result=1; //To store the value of the result

    //now do factorial using while loop
    while (n!=1) {
      result=result*n;
      n--;
    }
    System.out.println(result);

  }

}
