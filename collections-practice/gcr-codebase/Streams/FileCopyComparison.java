import java.io.*;

public class FileCopyComparison {

    public static void main(String[] args) {

        String sourceFile = "largefile.dat";
        String normalCopy = "normalCopy.dat";
        String bufferedCopy = "bufferedCopy.dat";

        // -------- Normal File Streams --------
        try {
            long start = System.currentTimeMillis();

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(normalCopy);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            long end = System.currentTimeMillis();
            System.out.println("Normal Stream Time: " + (end - start) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------- Buffered Streams --------
        try {
            long start = System.currentTimeMillis();

            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream(bufferedCopy));

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            bis.close();
            bos.close();

            long end = System.currentTimeMillis();
            System.out.println("Buffered Stream Time: " + (end - start) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
