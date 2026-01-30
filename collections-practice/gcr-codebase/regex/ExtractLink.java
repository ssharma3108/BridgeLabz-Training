import java.util.*;

public class ExtractLink {
  public static void main(String[] args) {

    String str = "Visit https://www.google.com and http://example.org";
    String[] s = str.split(" ");
    ArrayList<String> arr = new ArrayList<>();
    String regex = "https?://(www\\.)?[a-z]+\\.[a-z]{2,3}";

    for (int i = 0; i < s.length; i++) {
      if (s[i].matches(regex)) {
        arr.add(s[i]);
        arr.add(" ");
      }
    }

    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i));
    }

  }
}
