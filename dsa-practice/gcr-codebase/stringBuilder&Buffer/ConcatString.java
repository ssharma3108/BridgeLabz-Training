
public class ConcatString {
  public static void main(String[] args) {
    String[] arr = { "Java", " ", "is", " ", "powerful" };
    StringBuffer str = new StringBuffer();

    for (String string : arr) {
      str.append(string);
    }
    String s = "";

    for (int i = 0; i < str.length(); i++) {
      s += str.charAt(i);
    }

    System.out.println(s);

  }
}
