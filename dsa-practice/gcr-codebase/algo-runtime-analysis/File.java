import java.util.*;
import java.io.*;

public class File {
  public static void main(String[] args) {

    try {
      InputStreamReader isr = new InputStreamReader(new FileInputStream("data.txt"), "UTF-8");
      BufferedReader br = new BufferedReader(isr);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      System.out.println("File Not found");
    }

  }
}
