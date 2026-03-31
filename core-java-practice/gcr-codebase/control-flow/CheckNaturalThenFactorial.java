import java.util.*;
public class CheckNaturalThenFactorial {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    //taking input from the user
    int n=sc.nextInt();
    int result=1; //To store the value of the result

    //first check for natural number
    if(n>=1){
      for (int i = n; i >= 1; i--) {
        result=result*i;
      }
    }



    System.out.println(result);

  }

}
