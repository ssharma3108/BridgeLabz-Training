import java.util.Scanner;

public class SubstringVsCharAt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    String str = sc.next();
    int start = sc.nextInt();
    int end = sc.nextInt();

    // first compare with substring
    String result1 = str.substring(start, end);

    // compare with charAt
    String result2 = ""; // make empty string and compare it with other
    for (int i = start; i <= end; i++) {
      result2 += str.charAt(i);
    }

    // now comapare both of them and print the result
    System.out.println(result1.equals(result2));
  }
}
