import java.util.*;

public class RemoveDuplicates {
public static void main(String[] args) {
  int [] arr={1,2,3,4,4,5,7,8};


  HashSet<Integer> hs=new HashSet<>();

  for (Integer x : arr) {
    hs.add(x);
  }

  System.out.println(hs);
}
}
