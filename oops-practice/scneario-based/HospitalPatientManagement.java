import java.util.*;

interface IPayable {
  void calculateBill();

}

abstract class Patient {
  private int id;
  private String name;
  private int pricePerDays;

  Patient(int id, String name, int pricePerDays) {
    this.id = id;
    this.name = name;
    this.pricePerDays = pricePerDays;
  }

  // getter
  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getPricePerDays() {
    return pricePerDays;
  }

  // display
  void displayInfo() {
    System.out.println("Patient Id -: " + id);
    System.out.println("Name -: " + name);
    System.out.println("Price per days -: " + pricePerDays);
  }

}

class Inpatient extends Patient implements IPayable {
  private int days;

  Inpatient(int id, String name, int pricePerDays, int days) {
    super(id, name, pricePerDays);
    this.days = days;
  }

  public int getDays() {
    return days;
  }

  @Override
  public void calculateBill() {
    int total = days * getPricePerDays();
    System.out.println("Total bill -: " + total);
  }

  @Override
  void displayInfo() {
    super.displayInfo();
    calculateBill();
  }

}

public class HospitalPatientManagement {
  public static void main(String[] args) {

    Inpatient ip=new Inpatient(21, "Shivam", 2500, 4);

    ip.displayInfo();

  }
}
