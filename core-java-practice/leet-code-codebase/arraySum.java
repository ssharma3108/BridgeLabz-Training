public class arraySum {
  public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6,7,8,9};  //taking array as an input
    int sum=0;  //initalize as zero

    for (int i = 0; i < arr.length; i++) {  //loop
      sum+=arr[i];  // adding elements to sum variable
    }
    System.out.println(sum);  //return the sum of the array

  }
}
