import java.util.*;

public class CountVowelsConsonets {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from the user
    String str = sc.next();
    str.toLowerCase();

    int vowels = 0;
    int consonet = 0;

    // run a loop and check for thte vowels and consonents.......
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
      } else {
        consonet++;
      }
    }

    // print the output
    System.out.println("The number of vowels -:" + vowels + " and the numeber of consonents are -:" + consonet);

  }
}
