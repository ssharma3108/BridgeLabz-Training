public class SSN {
  public static void main(String[] args) {
    String str = "My SSN is 123-45-6789.";

    String[] s = str.split(" ");

    String regex = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";

    boolean found = false;

    for (int i = 0; i < s.length; i++) {

      s[i] = s[i].replaceAll("[^0-9-]", "");

      if (s[i].matches(regex)) {
        System.out.println("Valid");
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Invalid");
    }
  }
}
