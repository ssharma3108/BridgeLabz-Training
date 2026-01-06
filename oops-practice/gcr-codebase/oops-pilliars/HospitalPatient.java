// Interface
interface MedicalRecord {
  void addRecord();

  void viewRecord();
}

// Abstract class
abstract class Patient {
  private int patientId;
  private String name;
  private int age;

  Patient(int patientId, String name, int age) {
    this.patientId = patientId;
    this.name = name;
    this.age = age;
  }

  // abstract method
  abstract void calculateBill();

  // concrete method
  void getPatientDetails() {
    System.out.println("Patient ID : " + patientId);
    System.out.println("Name       : " + name);
    System.out.println("Age        : " + age);
  }
}

// ---------------- IN PATIENT ----------------
class InPatient extends Patient implements MedicalRecord {

  private int daysAdmitted;
  private double dailyCharge;
  private String medicalHistory;

  InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
    super(patientId, name, age);
    this.daysAdmitted = daysAdmitted;
    this.dailyCharge = dailyCharge;
  }

  @Override
  public void addRecord() {
    medicalHistory = "Admitted for treatment and observation";
    System.out.println("Medical record added for InPatient.");
  }

  @Override
  public void viewRecord() {
    System.out.println("Medical Record : " + medicalHistory);
  }

  @Override
  void calculateBill() {
    double bill = daysAdmitted * dailyCharge;
    System.out.println("Total Bill (InPatient): " + bill);
  }

  @Override
  void getPatientDetails() {
    super.getPatientDetails();
    System.out.println("Days Admitted : " + daysAdmitted);
  }
}

// ---------------- OUT PATIENT ----------------
class OutPatient extends Patient implements MedicalRecord {

  private double consultationFee;
  private String medicalHistory;

  OutPatient(int patientId, String name, int age, double consultationFee) {
    super(patientId, name, age);
    this.consultationFee = consultationFee;
  }

  @Override
  public void addRecord() {
    medicalHistory = "Visited for consultation";
    System.out.println("Medical record added for OutPatient.");
  }

  @Override
  public void viewRecord() {
    System.out.println("Medical Record : " + medicalHistory);
  }

  @Override
  void calculateBill() {
    System.out.println("Total Bill (OutPatient): " + consultationFee);
  }

  @Override
  void getPatientDetails() {
    super.getPatientDetails();
  }
}

// ---------------- MAIN CLASS ----------------
public class HospitalPatient {
  public static void main(String[] args) {

    Patient p1 = new InPatient(101, "Shivam", 25, 5, 2000);
    Patient p2 = new OutPatient(102, "Aman", 30, 500);

    System.out.println("----- InPatient Details -----");
    p1.getPatientDetails();
    ((MedicalRecord) p1).addRecord();
    ((MedicalRecord) p1).viewRecord();
    p1.calculateBill();

    System.out.println("\n----- OutPatient Details -----");
    p2.getPatientDetails();
    ((MedicalRecord) p2).addRecord();
    ((MedicalRecord) p2).viewRecord();
    p2.calculateBill();
  }
}
