import java.util.*;

public class CheckTwoSetsEqual {
  public static void main(String[] args) {

    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();

    s1.add(1);
    s1.add(2);
    s1.add(3);

    s2.add(3);
    s2.add(1);
    s2.add(2);

    System.out.println(s1.equals(s2)); // true
  }
}
