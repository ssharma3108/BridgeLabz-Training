import java.io.*;

public class ReadLargeFile {

    public static void main(String[] args) {

        String filePath = "largeLogFile.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("error")) {
                    System.out.println(line);
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
