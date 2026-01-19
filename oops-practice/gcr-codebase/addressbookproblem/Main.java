package addressbookproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Contact> addressList = new ArrayList<>();
    AddAddressBook addBook = new AddAddressBook();

    System.out.println("Welcome to the Address Book Program.");

    while (true) {
      System.out.print(
          "Enter Your choice -: 1 for display AddressBook | 2 for Add Contact | 3 for Update Contatct | 4 for Delete Contact | 5 for Search  -: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          for (Contact contact : addressList) {
            System.out.println(contact);
          }
          break;

        case 2:
          addBook.addData(addressList);
          break;

        default:
          System.out.println("Invaild Input");
          break;
      }

    }

  }
}
