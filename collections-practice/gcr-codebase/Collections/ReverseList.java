import java.util.*;

class ReverseList {
  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<>();
    ls.add(5);
    ls.add(4);
    ls.add(3);
    ls.add(2);
    ls.add(1);

    Collections.reverse(ls);

    System.out.println(ls);

  }
}