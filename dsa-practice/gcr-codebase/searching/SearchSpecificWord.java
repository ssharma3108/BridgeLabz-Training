public class SearchSpecificWord {
  public static void main(String[] args) {
    String[] sentences = {
        "Java is powerful",
        "Python is easy",
        "Data structures matter"
    };

    String word = "Python";
    boolean isFound = false;

    for (String sentence : sentences) {
      if (sentence.toLowerCase().contains(word.toLowerCase())) {
        System.out.println("Word found in sentence: " + sentence);
        isFound = true;
        break;
      }
    }

    if (!isFound) {
      System.out.println("No Word Found...");
    }
  }
}
