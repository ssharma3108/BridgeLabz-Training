import java.io.*;

public class ConsoleToFile {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      FileWriter fw = new FileWriter("output.txt", true);

      String input;
      System.out.println("Enter text (type 'exit' to stop):");

      while (true) {
        input = br.readLine();
        if (input.equalsIgnoreCase("exit")) {
          break;
        }
        fw.write(input + "\n");
      }

      fw.close();
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
