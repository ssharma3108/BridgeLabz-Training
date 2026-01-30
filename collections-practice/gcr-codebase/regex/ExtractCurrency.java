public class ExtractCurrency {
  public static void main(String[] args) {
    String str = "The price is $45.99, and the discount is 10.50.";
    String[] s = str.split(" ");
    String regex = "^[0-9]+$";

    for (int i = 0; i < s.length; i++) {
      s[i] = s[i].replaceAll("[A-Za-z]", "");

      System.out.print(s[i]);
    }

  }
}
