import java.util.Scanner;


public class DivisibleByFive {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //taking input from the user
    int number =sc.nextInt();

    //checking with the  divisiblity rule of 5.........
    int result= number%5;

    //using conditionals for printing the output
    if(result==0){
      System.err.println("The number "+number+"is divisible by 5");
    }else{
      System.out.println("The number "+number+"is not divisible by 5");
    }


  }

}
