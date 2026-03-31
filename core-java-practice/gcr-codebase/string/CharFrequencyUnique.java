import java.util.Scanner;

public class CharFrequencyUnique {

  // Find unique characters using charAt() and nested loops
  public static char[] uniqueCharacters(String text) {

    char[] temp = new char[text.length()];
    int uniqueCount = 0;

    for (int i = 0; i < text.length(); i++) {
      char current = text.charAt(i);
      boolean isUnique = true;

      // check if already present
      for (int j = 0; j < uniqueCount; j++) {
        if (temp[j] == current) {
          isUnique = false;
          break;
        }
      }

      if (isUnique) {
        temp[uniqueCount] = current;
        uniqueCount++;
      }
    }

    // copy exact size array
    char[] unique = new char[uniqueCount];
    for (int i = 0; i < uniqueCount; i++) {
      unique[i] = temp[i];
    }

    return unique;
  }

  // Find frequency using ASCII array and return 2D array
  public static String[][] characterFrequency(String text) {

    int[] freq = new int[256]; // ASCII frequency array

    // count frequency
    for (int i = 0; i < text.length(); i++) {
      freq[text.charAt(i)]++;
    }

    // get unique characters
    char[] unique = uniqueCharacters(text);

    // create 2D array
    String[][] result = new String[unique.length][2];

    // store character and frequency
    for (int i = 0; i < unique.length; i++) {
      result[i][0] = String.valueOf(unique[i]);
      result[i][1] = String.valueOf(freq[unique[i]]);
    }

    return result;
  }

  // main method
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // input
    String text = sc.nextLine();

    String[][] output = characterFrequency(text);

    // display result
    System.out.println("Character\tFrequency");
    System.out.println("---------------------");
    for (int i = 0; i < output.length; i++) {
      System.out.println(output[i][0] + "\t\t" + output[i][1]);
    }
  }
}
