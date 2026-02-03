package annotationReflections;

import java.lang.reflect.Field;

class Id {
    private String name;

    Id(String name) {
        this.name = name;
    }
}

public class AccessPrivate {
    public static void main(String[] args) throws Exception {

        Id id = new Id("Reflection");

        Class<?> clsClass = id.getClass();

        
        Field field = clsClass.getDeclaredField("name");

        
        field.setAccessible(true);

    
        System.out.println("Before: " + field.get(id));

        
        field.set(id, "Java Reflection");

        
        System.out.println("After: " + field.get(id));
    }
}
