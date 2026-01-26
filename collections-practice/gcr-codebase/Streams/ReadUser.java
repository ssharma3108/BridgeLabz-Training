import java.util.*;
import java.io.*;

public class ReadUser {
  public static void main(String[] args) {
    String source = "W:\\Capgemini-Training\\BridgeLabz-Training\\collections-practice\\gcr-codebase\\Streams\\s.txt";
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the name -: ");
    String name = sc.nextLine();

    System.out.print("Enter the age -: ");
    int age = sc.nextInt();

    sc.nextLine();

    System.out.print("Enter the programming language -: ");
    String language = sc.nextLine();

    try (BufferedWriter bf = new BufferedWriter(new FileWriter(source, true))) {

      bf.write("Name: " + name);
      bf.newLine();

      bf.write("Age: " + String.valueOf(age));
      bf.newLine();

      bf.write("Language: " + language);
      bf.newLine();
      bf.write("-------------------");
      bf.newLine();

      System.out.println("Operation done successfully!");

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
