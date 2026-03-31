package streamAPI;

import java.util.*;
import java.util.Arrays;

class Doctor{
	String nameString;
	String specialityString;
	String avaliablityString;
	
	
	public Doctor(String nameString,String speciaString,String avaliablityString) {
		this.nameString=nameString;
		this.specialityString=speciaString;
		this.avaliablityString=avaliablityString;
	}
	
	public String  toString() {
		return "Name -: "+nameString+" Speciality -: "+specialityString+" Avaliablity -: "+avaliablityString;
	}
	
	
}

public class HospitalDoctor {
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
	
	
	//doctor avaliable on weekends
	doctors.stream().filter(x->x.avaliablityString.equals("Weekend")).forEach(System.out::println);

}
}
