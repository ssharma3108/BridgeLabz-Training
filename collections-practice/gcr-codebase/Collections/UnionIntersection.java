import java.util.*;

public class UnionIntersection {
  public void findUnion(Set<Integer> s1, Set<Integer> s2) {
    List<Integer> s3 = new ArrayList<>();
    for (Integer i : s2) {
      if (s1.contains(i)) {
        s3.add(i);
      }
    }

    int[] arr = new int[s3.size()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s3.get(i);
    }

    System.out.println("Union -: " + Arrays.toString(arr));
  }

  public void findIntersection(Set<Integer> s1, Set<Integer> s2) {
    int[] arr = new int[s1.size() + s2.size()];
    int index = 0;

    for (Integer i : s1) {
      arr[index++] = i;
    }
    for (Integer i : s2) {
      arr[index++] = i;
    }

    // now add elements in sets
    Set<Integer> s = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      s.add(arr[i]);
    }

    System.out.println("Intersection -: " + s);

  }

  public static void main(String[] args) {
    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();

    s1.add(1);
    s1.add(2);
    s1.add(3);

    s2.add(3);
    s2.add(4);
    s2.add(5);

    UnionIntersection u = new UnionIntersection();
    u.findUnion(s1, s2);
    u.findIntersection(s1, s2);

  }
}
