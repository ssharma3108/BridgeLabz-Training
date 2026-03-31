public class swapTwoNumber {
  public static void main(String[] args) {
    int a=24;
    int b=25;

    //we perform XOR operation for swapping the numbers 
    a=a^b;
    b=b^a;
    a=a^b;

    System.out.println("The first number after swap a="+a);
     System.out.println("The second number after swap b="+b);

  }

}
