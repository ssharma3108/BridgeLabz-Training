package designPatterns;

public class Student extends User {

    public Student(String name) {
        super(name);
    }

    @Override
    public int getBorrowLimit() {
        return 14;
    }
}
