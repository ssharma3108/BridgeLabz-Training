import java.util.*;

public class StringConcat {

  public void ConcatUsingString(String s1, String s2) {
    System.out.println("Concatinated String -: " + (s1 + s2));
  }

  public void ConcatUsingStringBuilder(String s1, String s2) {
    StringBuilder str = new StringBuilder(s1).append(s2);
    System.out.println(str.toString());
  }

  public void ConcatUsingStringBuffer(String s1, String s2) {
    StringBuffer str = new StringBuffer(s1).append(s2);
    System.out.println(str);
  }

  public static void main(String[] args) {

    String s1 = "shivam";
    String s2 = "Sharma";

    StringConcat s = new StringConcat();
    s.ConcatUsingString(s1, s2);
    s.ConcatUsingStringBuffer(s1, s2);
    s.ConcatUsingStringBuilder(s1, s2);

  }

}