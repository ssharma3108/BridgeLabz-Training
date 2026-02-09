package designPatterns;

public class Faculty extends User {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public int getBorrowLimit() {
        return 30;
    }
}
