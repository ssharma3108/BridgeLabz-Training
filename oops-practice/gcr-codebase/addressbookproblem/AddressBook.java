package addressbookproblem;

import java.util.*;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    // UC1 + UC6
    public void addContact(Contact contact) {
        if (contactList.contains(contact)) {
            System.out.println("Duplicate Entry Not Allowed!");
            return;
        }
        contactList.add(contact);
        System.out.println("Contact Added Successfully!");
    }

    // UC2
    public void editContact(String name, Scanner sc) {
        for (Contact c : contactList) {
            if (c.getFirstName().equalsIgnoreCase(name)) {

                System.out.print("Enter New City: ");
                c.setCity(sc.next());

                System.out.print("Enter New State: ");
                c.setState(sc.next());

                System.out.println("Contact Updated Successfully!");
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }

    // UC3
    public void deleteContact(String name) {
        Iterator<Contact> iterator = contactList.iterator();

        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getFirstName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Contact Deleted Successfully!");
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }

    // Display
    public void displayContacts() {
        contactList.forEach(System.out::println);
    }

    // UC8
    public void searchByCity(String city) {
        contactList.stream()
                .filter(c -> c.getCity().equalsIgnoreCase(city))
                .forEach(System.out::println);
    }

    // UC9
    public void countByCity(String city) {
        long count = contactList.stream()
                .filter(c -> c.getCity().equalsIgnoreCase(city))
                .count();
        System.out.println("Total Persons in " + city + " = " + count);
    }

    // UC10
    public void sortByName() {
        contactList.sort(Comparator.comparing(Contact::getFirstName));
        displayContacts();
    }

    // UC11
    public void sortByCity() {
        contactList.sort(Comparator.comparing(Contact::getCity));
        displayContacts();
    }
}
