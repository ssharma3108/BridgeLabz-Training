
public class ExtractDates {
  public static void main(String[] args) {
    String str = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
    String[] s = str.split(" ");

    String regex = "[0-9]{1,2}/[0-9]{2}/[0-9]{4}[,.]?";

    for (int i = 0; i < s.length; i++) {
      s[i] = s[i].replaceAll("^[A-Za-z]*$", "");

      if (s[i].matches(regex)) {
        System.out.print(s[i]);
      }
    }

  }
}
