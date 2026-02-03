package annotationReflections;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        MathOperations math = new MathOperations();

        Class<?> cls = math.getClass();

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Step 1: Get method dynamically
        Method method = cls.getMethod(methodName, int.class, int.class);

        // Step 2: Invoke method
        Object result = method.invoke(math, a, b);

        // Step 3: Print result
        System.out.println("Result: " + result);
    }
}
