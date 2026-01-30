public class ReplaceSpace {
  public static void main(String[] args) {
    String str = "This is an example with multiple spaces.";
    String[] s = str.split(" ");

    for (int i = 0; i < s.length; i++) {
      s[i] = s[i].replaceAll("multiple", "single");

      System.out.print(s[i] + " ");
    }

  }
}
