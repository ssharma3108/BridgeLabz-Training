package addressbookproblem;

import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, AddressBook> addressBookMap = new HashMap<>();

        System.out.println("Welcome to Address Book Program");

        while (true) {

            System.out.println("\n1. Add AddressBook");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display Contacts");
            System.out.println("6. Search by City");
            System.out.println("7. Count by City");
            System.out.println("8. Sort by Name");
            System.out.println("9. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter AddressBook Name: ");
                    String bookName = sc.next();
                    addressBookMap.put(bookName, new AddressBook());
                    System.out.println("AddressBook Created!");
                    break;

                case 2:
                    System.out.print("Enter AddressBook Name: ");
                    bookName = sc.next();

                    AddressBook book = addressBookMap.get(bookName);
                    if (book == null) {
                        System.out.println("AddressBook Not Found!");
                        break;
                    }

                    System.out.print("First Name: ");
                    String first = sc.next();
                    System.out.print("Last Name: ");
                    String last = sc.next();
                    System.out.print("Address: ");
                    sc.nextLine();
                    String addr = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.next();
                    System.out.print("State: ");
                    String state = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();
                    System.out.print("Zip: ");
                    int zip = sc.nextInt();
                    System.out.print("Phone: ");
                    long phone = sc.nextLong();

                    book.addContact(new Contact(first, last, addr, city, state, email, zip, phone));
                    break;

                case 3:
                    System.out.print("AddressBook Name: ");
                    bookName = sc.next();
                    book = addressBookMap.get(bookName);
                    if (book != null) {
                        System.out.print("Enter First Name to Edit: ");
                        book.editContact(sc.next(), sc);
                    }
                    break;

                case 4:
                    System.out.print("AddressBook Name: ");
                    bookName = sc.next();
                    book = addressBookMap.get(bookName);
                    if (book != null) {
                        System.out.print("Enter First Name to Delete: ");
                        book.deleteContact(sc.next());
                    }
                    break;

                case 5:
                    System.out.print("AddressBook Name: ");
                    bookName = sc.next();
                    book = addressBookMap.get(bookName);
                    if (book != null) book.displayContacts();
                    break;

                case 6:
                    System.out.print("AddressBook Name: ");
                    bookName = sc.next();
                    book = addressBookMap.get(bookName);
                    if (book != null) {
                        System.out.print("Enter City: ");
                        book.searchByCity(sc.next());
                    }
                    break;

                case 7:
                    System.out.print("AddressBook Name: ");
                    bookName = sc.next();
                    book = addressBookMap.get(bookName);
                    if (book != null) {
                        System.out.print("Enter City: ");
                        book.countByCity(sc.next());
                    }
                    break;

                case 8:
                    System.out.print("AddressBook Name: ");
                    bookName = sc.next();
                    book = addressBookMap.get(bookName);
                    if (book != null) book.sortByName();
                    break;

                case 9:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
