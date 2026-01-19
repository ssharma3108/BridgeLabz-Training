package addressbookproblem;

import java.util.*;

class Contact {
  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private int zip;
  private long phoneNumber;
  private String mail;

  Contact(String firstName, String lastName, String address, String city, String state, String mail, int zip,
      long phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.mail = mail;
    this.zip = zip;
    this.phoneNumber = phoneNumber;
  }

  // getter and setter
  public String getAddress() {
    return address;
  }

  public String getCity() {
    return city;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMail() {
    return mail;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public String getState() {
    return state;
  }

  public int getZip() {
    return zip;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "Contact{" +
        "FirstName='" + firstName + '\'' +
        ", LastName='" + lastName + '\'' +
        ", Address='" + address + '\'' +
        ", City='" + city + '\'' +
        ", State='" + state + '\'' +
        ", Zip=" + zip +
        ", Phone=" + phoneNumber +
        ", Email='" + mail + '\'' +
        '}';
  }
}