package designPatterns;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<LibraryObserver> observers = new ArrayList<>();

    // private constructor
    private LibraryCatalog() {}

    // Singleton instance
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Observer registration
    public void subscribe(LibraryObserver observer) {
        observers.add(observer);
    }

    // Notify observers
    private void notifyObservers(Book book) {
        for (LibraryObserver observer : observers) {
            observer.update(book);
        }
    }

    // Add book to catalog
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
        notifyObservers(book);
    }
}
