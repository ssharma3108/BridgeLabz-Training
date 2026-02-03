package annotationReflections;

import java.lang.reflect.Method;

class Calculator{
	
	private void multiply(int a,int b) {
		System.out.println(a*b);
	}
	
}


public class InvokePrivateMethod {
public static void main(String[] args) throws Exception {
	Calculator calculator=new Calculator();
	
	Class<?>class1=calculator.getClass();
	
	  // Step 2: Get private method with parameter types
    Method m = class1.getDeclaredMethod("multiply", int.class, int.class);

    // Step 3: Make it accessible
    m.setAccessible(true);

    // Step 4: Invoke method
    m.invoke(calculator, 5, 4);
}
}