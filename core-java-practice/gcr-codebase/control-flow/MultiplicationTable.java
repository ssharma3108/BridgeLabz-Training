import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //taking input from the user
    int n=sc.nextInt();

    //now do multiplication operation
    for (int i = 6; i <= 9; i++) {
      System.out.println(n+" * "+i+" = "+n*i);
    }
  }

}
