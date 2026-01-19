package addressbookproblem;

import java.util.*;

public class AddAddressBook {

  // method to add contact in addressbook
  public void addData(List<Contact> addressBook) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First Name: ");
    String firstName = sc.next();

    System.out.print("Enter Last Name: ");
    String lastName = sc.next();

    sc.nextLine(); // consume leftover newline

    System.out.print("Enter Address: ");
    String address = sc.nextLine();

    System.out.print("Enter City: ");
    String city = sc.next();

    System.out.print("Enter State: ");
    String state = sc.next();

    System.out.print("Enter Email: ");
    String mail = sc.next();

    System.out.print("Enter Zip Code: ");
    int zip = sc.nextInt();

    System.out.print("Enter Phone Number: ");
    long phoneNumber = sc.nextLong();

    Contact c = new Contact(firstName, lastName, address, city, state, mail, zip, phoneNumber);
    addressBook.add(c);

    System.out.println("Contact Added SuccessFully..............");

  }

}
