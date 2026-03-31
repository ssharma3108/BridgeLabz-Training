import java.util.Scanner;

public class SumOfNaturalNumberUsingForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    int number = sc.nextInt();
    int result1 = 0; //using loop
    int result2=0; // using formula

    // checking whether the given number is natural or not usig for loop
    if (number >= 1) {
      for (int i = 1; i <= number; i++) {
        result1 += i;
      }
    }else {
      System.out.println("Given number is not a natural number");
    }


    //check number using formula...
    if(number>=1){
      result2+=(number*(number+1))/2;
    }

    if(number>=1){
    System.out.println(result1==result2);}
  }
}