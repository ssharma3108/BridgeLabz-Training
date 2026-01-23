import java.util.*;

public class RemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<>();
    ls.add(3);
    ls.add(1);
    ls.add(2);
    ls.add(2);
    ls.add(1);
    ls.add(4);

    Set<Integer> hs = new LinkedHashSet<>(ls);
    System.out.println(hs);
  }
}