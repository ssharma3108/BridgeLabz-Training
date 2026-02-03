package annotationReflections;

import java.lang.reflect.Constructor;

class Student {
    String nameString;

    Student(String nameString) {
        this.nameString = nameString;
    }

    public void display() {
        System.out.println("Student Name -: " + nameString);
    }
}

public class CreateObject {
    public static void main(String[] args) throws Exception {

        Student student = new Student("Shivam");

        Class<?> cls = student.getClass();

        
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);

        Student s = (Student) constructor.newInstance("Shivam");

        s.display();
    }
}
