import java.util.*;

public class SearchingWithDSA {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6 };

    HashSet<Integer> hs = new HashSet<>();
    TreeSet<Integer> ts = new TreeSet<>();

    // Insert elements into sets
    for (int num : arr) {
      hs.add(num);
      ts.add(num);
    }

    int target = 4;

    // Searching using HashSet
    if (hs.contains(target)) {
      System.out.println("Found " + target + " using HashSet");
    } else {
      System.out.println("Not found using HashSet");
    }

    // Searching using TreeSet
    if (ts.contains(target)) {
      System.out.println("Found " + target + " using TreeSet");
    } else {
      System.out.println("Not found using TreeSet");
    }
  }
}
