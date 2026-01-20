public class Fibonacci {
  public int recursiveFibonacci(int n) {
    if (n <= 1)
      return n;
    return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
  }

  public int normalFibonacci(int n) {
    int a = 0, b = 1, sum;
    for (int i = 2; i <= n; i++) {
      sum = a + b;
      a = b;
      b = sum;
    }
    return b;
  }

  public static void main(String[] args) {
    int n = 10;
    Fibonacci f=new Fibonacci();
    f.recursiveFibonacci(n);
    f.normalFibonacci(n);
  }
}
