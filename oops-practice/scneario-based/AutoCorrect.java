import java.util.*;

public class AutoCorrect {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking input from the user
    System.out.print("Enter the paragraph -: ");
    String para = sc.nextLine();

    if (para == null || para.trim().isEmpty()) {
      System.out.println("Paragraph is empty.");
      return;
    }

    // Trim extra spaces between words
    String str = para.trim().replaceAll("\\s+", " ");

    // Process capitalization
    StringBuilder result = new StringBuilder();
    boolean capitalizeNext = true;

    for (int i = 0; i < str.length(); i++) {
      char current = str.charAt(i);

      // Capitalize if needed and it's a letter
      if (capitalizeNext && Character.isLetter(current)) {
        result.append(Character.toUpperCase(current));
        capitalizeNext = false;
      } else {
        result.append(current);
      }

      // If we hit punctuation, the next letter found should be capitalized
      if (current == '.' || current == '!' || current == '?') {
        capitalizeNext = true;
      }
    }

    // We use regex: look for . ! or ? and ensure a space follows if it's not the
    // end
    String finalOutput = result.toString()
        .replaceAll("([.!\\?])\\s*", "$1 ") // Adds space after punctuation
        .trim(); // Final trim

    // 5. Display the result
    System.out.println("\n--- Corrected Version ---");
    System.out.println(finalOutput);
  }
}