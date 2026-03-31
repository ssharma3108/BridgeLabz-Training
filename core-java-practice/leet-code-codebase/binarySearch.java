public class binarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 }; // this is the given array
    int find = 8; // element to be check
    boolean match = false; // if matches then true else false
    for (int i = 0; i < arr.length; i++) { // loop
      if (arr[i] == find) { // checking if our find element is matches with find or not
        match = true; // if matches change the find to true
      }
    }
    System.out.println(match); // print the output

  }
}
