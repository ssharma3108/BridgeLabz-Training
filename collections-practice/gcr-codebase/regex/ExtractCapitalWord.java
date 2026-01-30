
public class ExtractCapitalWord {
  public static void main(String[] args) {
    String str = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
    String[] words = str.split(" ");

    for (String word : words) {

      word = word.replace(".", "");

      if (word.matches("^[A-Z][a-z]*")) {
        System.out.println(word);
      }
    }
  }
}
