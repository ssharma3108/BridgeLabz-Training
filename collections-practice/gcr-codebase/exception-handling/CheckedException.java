import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CheckedException {
  public static void main(String[] args) {
    try {
      BufferedReader bf = new BufferedReader(new FileReader("data.txt"));
      String str;
      while ((str = bf.readLine()) != null) {
        System.out.println(bf.readLine());
      }
    } catch (IOException e) {
      System.out.println("File Not Found" + e.getMessage());
    }
  }
}
