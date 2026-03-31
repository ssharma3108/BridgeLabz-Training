import java.util.Scanner;

public class IntOperation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // now taking input from the user
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // now perform operations
    int op1 = a + b * c;
    int op2 = a * b + c;
    int op3 = c + a / b;
    int op4 = a % b + c;

    // now print the result
    System.out.println("The results of Int Operations are " + op1 + " , " + op2 + " , " + op3 + " and " + op4);

  }
}
