import java.util.*;

class StockSpan {
  public static int[] calculateSpan(int[] arr, int n) {
    Stack<Integer> st = new Stack<>();
    int[] span = new int[n];

    for (int i = 0; i < n; i++) {

      // Pop while current price is higher than stack top
      while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
        st.pop();
      }

      // If stack is empty, price is highest so far
      span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());

      // Push current index
      st.push(i);
    }

    return span;
  }

  public static void main(String[] args) {
    int[] arr1 = { 100, 80, 90, 120 };
    int[] result1 = calculateSpan(arr1, arr1.length);
    System.out.println(Arrays.toString(result1));

    int[] arr2 = { 10, 4, 5, 90, 120, 80 };
    int[] result2 = calculateSpan(arr2, arr2.length);
    System.out.println(Arrays.toString(result2));
  }
}
