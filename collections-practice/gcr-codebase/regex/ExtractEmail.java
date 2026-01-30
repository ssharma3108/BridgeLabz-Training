import java.util.Scanner;

public class ExtractEmail {
  public static void main(String[] args) {
    String str = "Contact us at support@example.com and info@company.org";
    String[] s = str.split(" ");
    String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    for (int i = 0; i < s.length; i++) {
      if (s[i].matches(regex)) {
        System.out.println(s[i]);
      }
    }
  }
}
