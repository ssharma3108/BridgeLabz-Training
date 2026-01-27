import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosing {
  public static void main(String[] args) throws IOException {
    try {
      BufferedReader bf = new BufferedReader(new FileReader("info.txt"));
      String str;
      while ((str = bf.readLine()) != null) {
        System.out.println(bf);
        break;
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error Occured " + e.getMessage());
    }
  }
}
