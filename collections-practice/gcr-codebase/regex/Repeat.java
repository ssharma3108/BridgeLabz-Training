import java.util.*;

public class Repeat {
  public static void main(String[] args) {

    String str = "This is is a repeated repeated word test.";

    HashMap<String, Integer> hs = new HashMap<>();

    // split string into words
    String[] words = str.split(" ");

    for (String s : words) {
      hs.put(s, hs.getOrDefault(s, 0) + 1);
    }

    // print words that appear exactly twice
    for (Map.Entry<String, Integer> entry : hs.entrySet()) {
      if (entry.getValue() == 2) {
        System.out.println(entry.getKey());
      }
    }
  }
}
