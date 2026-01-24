import java.util.*;

public class SubsetChecker {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

    // Built-in method use karke
    boolean isSubset = set2.containsAll(set1);

    System.out.println("Set1 is subset of Set2: " + isSubset);
  }
}