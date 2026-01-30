public class LanguageMatch {
  public static void main(String[] args) {

    String str = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
    String[] matches = { "Java", "Python", "JavaScript", "Go" };

    String[] words = str.split(" ");

    for (String word : words) {
      for (String match : matches) {
        if (word.replaceAll("[^a-zA-Z]", "").equals(match)) {
          System.out.println(match);
        }
      }
    }
  }
}
