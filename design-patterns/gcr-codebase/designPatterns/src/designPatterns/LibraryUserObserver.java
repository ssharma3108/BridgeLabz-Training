package designPatterns;

public class LibraryUserObserver implements LibraryObserver {

    private String userName;
    private String interestedBook;

    public LibraryUserObserver(String userName, String interestedBook) {
        this.userName = userName;
        this.interestedBook = interestedBook;
    }

    @Override
    public void update(Book book) {
        if (book.getTitle().equalsIgnoreCase(interestedBook)) {
            System.out.println("Notification to " + userName +
                    ": Book now available -> " + book.getTitle());
        }
    }
}
