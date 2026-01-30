
public class ReplaceBad {
  public static void main(String[] args) {

    String sentence = "This is a damn bad example with some stupid words.";
    String[] badWords = { "damn", "stupid" };

    for (int i = 0; i < badWords.length; i++) {
      sentence = sentence.replaceAll("\\b" + badWords[i] + "\\b", "****");
    }

    System.out.println(sentence);
  }
}
