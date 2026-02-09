package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryBookStats {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 450),
            new Book("Science", 500),
            new Book("Science", 350),
            new Book("History", 400)
        );

        // Group by genre and calculate statistics
        Map<String, IntSummaryStatistics> dataMap =
            books.stream()
                 .collect(Collectors.groupingBy(
                     Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)
                 ));

        // Print result........
        dataMap.forEach((genre, stats) -> {
            System.out.println(
                genre +
                " → Total: " + stats.getSum() +
                ", Average: " + stats.getAverage() +
                ", Max: " + stats.getMax()
            );
        });
    }
}
