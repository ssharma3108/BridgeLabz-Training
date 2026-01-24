import java.util.*;

public class Symmetric {
  public static void main(String[] args) {
    Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

    List<Integer> ls = new ArrayList<>();

    for (Integer integer : s1) {
      ls.add(integer);
    }

    for (Integer integer : s2) {
      if (ls.contains(integer)) {
        ls.remove(integer);
      } else {
        ls.add(integer);
      }
    }

    System.out.println(ls);

  }
}
