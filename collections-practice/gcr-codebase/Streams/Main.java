import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String filePath = "data.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-z ]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 5 most frequent words:");
        int count = 0;

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            count++;
            if (count == 5)
                break;
        }
    }
}
