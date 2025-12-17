import java.util.Scanner;

public class simpleIntrest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double pricipal = sc.nextInt();
    double rate = sc.nextInt();
    double time = sc.nextInt();

    // now calculate the SI (pricipal*rate*time)/100
    double result = (pricipal * rate * time) / 100;

    System.out.println(result);
  }
}
