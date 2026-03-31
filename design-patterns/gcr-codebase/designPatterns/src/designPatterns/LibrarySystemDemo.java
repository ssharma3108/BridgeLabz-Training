package designPatterns;

import java.util.Arrays;

public class LibrarySystemDemo {
    public static void main(String[] args) {

        // Singleton Catalog
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory Users
        User student = UserFactory.createUser("student", "Amit");
        User faculty = UserFactory.createUser("faculty", "Dr. Sharma");

        // Observer subscriptions
//        catalog.subscribe(new LibraryUserObserver(student.getName(),
//                "Data Structures by Cormen"));
//        catalog.subscribe(new LibraryUserObserver(faculty.getName(),
//                "Data Structures by Cormen"));

        // Builder Book
        Book book = new Book.BookBuilder("Data Structures by Cormen")
                .authors(Arrays.asList("Cormen", "Leiserson"))
                .edition("3rd Edition")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        // Add book → triggers notification
        catalog.addBook(book);
    }
}
