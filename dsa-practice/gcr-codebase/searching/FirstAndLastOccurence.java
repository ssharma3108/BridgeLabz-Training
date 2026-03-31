public class FirstAndLastOccurence {
public static void main(String[] args) {
  int [] arr={2, 4, 4, 4, 6, 7, 8};
  int target=4;

  int first=-1;
  int last=-1;

  for (int i = 0; i < arr.length; i++) {
    if(arr[i]==target){
      first=i;
      break;
    }
  }

  for (int i =first; i < arr.length; i++) {
    if(arr[i]==target){
      last=i;
    }
  }



  System.out.println("First occurence -: "+first);
  System.out.println("Last Occurence -: "+last);

}
}
