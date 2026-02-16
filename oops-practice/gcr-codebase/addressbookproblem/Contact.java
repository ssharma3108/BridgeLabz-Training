package addressbookproblem;

import java.util.Objects;

public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String mail;

    public Contact(String firstName, String lastName, String address,
                   String city, String state, String mail,
                   int zip, long phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.mail = mail;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    // Getters & Setters

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public int getZip() { return zip; }

    public void setAddress(String address) { this.address = address; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setMail(String mail) { this.mail = mail; }
    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    // Duplicate Check (UC7)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact c = (Contact) obj;
        return firstName.equalsIgnoreCase(c.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                " | " + city + " | " + state +
                " | " + zip;
    }
}
