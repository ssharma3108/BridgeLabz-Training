import java.util.*;

public class ParagraphAnalyzer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the paragraph -: ");
    String para = sc.nextLine(); // taking a string para as a input

    System.out.print("Enter the word to replace  -: ");
    String word = sc.next();
    System.out.print("Enter the Replacement Word -: ");
    String replace = sc.next();

    String edge = "";

    // for edge cases
    if (para.trim().isEmpty()) {
      System.out.println("The paragraph is empty. Please restart.");
      return; // This stops the main method so the rest of the code doesn't crash
    }
    int total = 0; // to count the word ..
    String longest = "";
    int max = Integer.MIN_VALUE;

    String[] str = para.split(" ");

    // for replace the words
    for (int i = 0; i < str.length; i++) {
      if (str[i].equals(word)) {
        str[i] = replace;
      }
    }

    // to display the paragraph
    System.out.print("The paragraph is -: "); // Print header ONCE before the loop
    for (String s : str) {
      System.out.print(s + " "); // Print each word followed by a space
    }

    // to display the longest word in the word
    for (String s : str) {
      if (max < s.length()) {
        max = s.length();
        longest = s;
      }
    }

    System.out.println("\n The maximum length is -: " + max + " and the longest word is -: " + longest);
    System.out.println("\nTotal number of words in paragraph -: " + str.length);

  }
}
