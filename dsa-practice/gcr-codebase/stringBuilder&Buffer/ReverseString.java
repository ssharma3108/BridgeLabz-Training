import java.util.*;
public class ReverseString {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();


  StringBuilder s=new StringBuilder(str);

  s.reverse();

String x="";

for (int i = 0; i < s.length(); i++) {
  x+=s.charAt(i);
}

System.out.println("The reversed String is -: "+x);




  }

}
