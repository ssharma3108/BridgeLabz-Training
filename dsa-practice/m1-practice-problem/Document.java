import java.util.*;

class DocumentRedactionEngine {

  
    public String processLine(String input) {


        return input;
    }
}

class Document {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocumentRedactionEngine engine = new DocumentRedactionEngine();

        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String result = engine.processLine(line);
            System.out.println(result);
        }

        sc.close();
    }
}