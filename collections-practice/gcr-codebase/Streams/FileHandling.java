import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String source = "W:\\Capgemini-Training\\BridgeLabz-Training\\collections-practice\\gcr-codebase\\Streams\\file.txt";
        String destination = "W:\\Capgemini-Training\\BridgeLabz-Training\\collections-practice\\gcr-codebase\\Streams\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(source));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {

            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(s);
                writer.newLine();
            }
            System.out.println("Copying Done!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}