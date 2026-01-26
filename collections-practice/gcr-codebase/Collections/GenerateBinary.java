import java.util.*;

public class GenerateBinary {
  public static void main(String[] args) {
    int n = 5;

    Queue<String> q = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      q.add(Integer.toBinaryString(i));
    }

    System.out.println(q);
  }
}