package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
  public static void main(String[] args) {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // ENQUEUE (add elements)
    st1.push(10);
    st1.push(20);
    st1.push(30);

    // DEQUEUE logic (transfer when needed)
    while (!st1.isEmpty()) {
      st2.push(st1.pop());
    }

    // Queue implementation
    Queue<Integer> q = new LinkedList<>();

    while (!st2.isEmpty()) {
      q.add(st2.pop());
    }

    // DISPLAY queue
    while (!q.isEmpty()) {
      System.out.println(q.poll());
    }
  }
}
