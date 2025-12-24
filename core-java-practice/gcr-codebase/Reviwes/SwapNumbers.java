public class SwapNumbers {
  public static void main(String[] args) {
    int a = 12;
    int b = 13;

    System.out.println("Before Swap a " + a);
    System.out.println("Before Swap b " + b);

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("After Swap a " + a);
    System.out.println("After Swap b " + b);
  }
}
