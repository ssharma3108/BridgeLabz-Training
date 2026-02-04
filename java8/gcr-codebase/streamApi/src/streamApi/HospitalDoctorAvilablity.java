package streamApi;

import java.util.*;
import java.util.ArrayList;

class Doctor{
	String doctorName;
	String speciality;
	String availablity;
	
	
	public Doctor(String doctorName,String speciality,String availablity) {
		this.doctorName=doctorName;
		this.speciality=speciality;
		this.availablity=availablity;
	}
	
	public String  toString() {
		return "DoctorName -: "+doctorName+" Speciality -: "+speciality+" Avaliablity -:"+availablity;
	}
	
	
}


public class HospitalDoctorAvilablity {
public static void main(String[] args) {
	List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiology", "Weekend"),
            new Doctor("Dr. Mehta", "Dermatology", "Weekday"),
            new Doctor("Dr. Singh", "Neurology", "Weekend"),
            new Doctor("Dr. Rao", "Orthopedics", "Weekend"),
            new Doctor("Dr. Khan", "Pediatrics", "Weekday"),
            new Doctor("Dr. Verma", "Oncology", "Weekend"),
            new Doctor("Dr. Iyer", "ENT", "Weekend"),
            new Doctor("Dr. Gupta", "General Medicine", "Weekday"),
            new Doctor("Dr. Nair", "Psychiatry", "Weekend"),
            new Doctor("Dr. Patel", "Radiology", "Weekday")
        );

	doctors.stream().filter(x->x.availablity.equals("Weekend")).sorted(Comparator.comparing(x->x.speciality)).forEach(System.out::println);
	
	
}
}
