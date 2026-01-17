import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) throws Exception {

        int n = 1_000_000;

        // StringBuffer
        long sbStart = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append("hello");
        }
        long sbEnd = System.nanoTime();

        // StringBuilder
        long sbdStart = System.nanoTime();
        StringBuilder sbld = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbld.append("hello");
        }
        long sbdEnd = System.nanoTime();

        System.out.println("StringBuffer Time: " + (sbEnd - sbStart));
        System.out.println("StringBuilder Time: " + (sbdEnd - sbdStart));

        // FileReader word count
        long frStart = System.nanoTime();
        BufferedReader br1 = new BufferedReader(new FileReader("bigfile.txt"));
        int wordCount1 = 0;
        String line;

        while ((line = br1.readLine()) != null) {
            wordCount1 += line.split("\\s+").length;
        }
        br1.close();
        long frEnd = System.nanoTime();

        // InputStreamReader word count
        long isrStart = System.nanoTime();
        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(new FileInputStream("bigfile.txt")));
        int wordCount2 = 0;

        while ((line = br2.readLine()) != null) {
            wordCount2 += line.split("\\s+").length;
        }
        br2.close();
        long isrEnd = System.nanoTime();

        System.out.println("FileReader Words: " + wordCount1 +
                " Time: " + (frEnd - frStart));
        System.out.println("InputStreamReader Words: " + wordCount2 +
                " Time: " + (isrEnd - isrStart));
    }
}
