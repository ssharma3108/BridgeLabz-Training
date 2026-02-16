package addressbookproblem;

import java.util.List;

public class Delete {

	public void deleteContact(String name,List<Contact> addressBook) {
		boolean isFound=false;
		for (Contact contact : addressBook) {
			if(contact.getFirstName().equalsIgnoreCase(name)) {
				addressBook.remove(contact);
				isFound=true;
			}
			
			if (isFound) {
				System.out.println("Contact Deleted Successfully !!!!!");
			}else {
				System.out.println("No such type of contact.........");
			}
		}
	}
	
}
