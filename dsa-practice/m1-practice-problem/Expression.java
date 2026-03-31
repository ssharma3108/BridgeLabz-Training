import java.util.*;

// ExpressionTagEngine Class
class ExpressionTagEngine {


    public String evaluate(String input) {
      String regex="";
        return null;
    }
}

// Main Class
class Expression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpressionTagEngine engine = new ExpressionTagEngine();

        int n = sc.nextInt(); // number of input lines
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            // Call evaluate method
            String result = engine.evaluate(line);
            System.out.println(result);
        }

        sc.close();
    }
}