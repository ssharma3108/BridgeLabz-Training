import java.util.*;

public class ReverseQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(10);
    q.add(20);
    q.add(30);

    System.out.println(q);

    Queue<Integer> reverseQueue = new LinkedList<>();

    while (!q.isEmpty()) {
      int element = ((LinkedList<Integer>) q).getLast();
      reverseQueue.add(element);
      q.remove(element);
    }
    System.out.println(reverseQueue);

  }
}
