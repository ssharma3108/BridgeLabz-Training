import java.util.HashSet;

public class RemoveDuplicates {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("naman");
    HashSet<Character> hs = new HashSet<>();
    String x = "";

    for (int i = 0; i < str.length(); i++) {
      if (!hs.contains(str.charAt(i))) {
        hs.add(str.charAt(i));
      }
    }

    for (Character character : hs) {
      x += character;
    }

    System.out.println("New element -: " + x);

  }
}
