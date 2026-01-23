import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Frequency {
  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();

    ls.add("apple");
    ls.add("banana");
    ls.add("apple");
    ls.add("orange");

    HashMap<String, Integer> hs = new HashMap<>();

    for (String fruit : ls) {
      hs.put(fruit, hs.getOrDefault(fruit, 0) + 1);
    }

    System.out.println(hs);

  }
}
