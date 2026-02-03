package annotationReflections;

import java.lang.reflect.Method;

class Info {

    String nameString;

    public Info(String nameString) {
        this.nameString = nameString;
    }

    public void callMethod() {
        System.out.println("Method called Successfully");
    }
}

public class GetClassInfo {
    public static void main(String[] args) {

        Info info = new Info("Reflection Demo");

       
        Class<?> cls = info.getClass();

       
        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}
