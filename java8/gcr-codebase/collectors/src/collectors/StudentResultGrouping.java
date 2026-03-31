package collectors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class Student {
String nameString;
String gradString;

 Student(String nameString,String gradString) {
	this.nameString=nameString;
	this.gradString=gradString;
}

 public String getGradString() {
	return gradString;
}
 public String getNameString() {
	return nameString;
}

 public String toString() {
	return nameString;
}
	
}



public class StudentResultGrouping {
public static void main(String[] args) {
	 List<Student> students = List.of(
	            new Student("Aman", "A"),
	            new Student("Ravi", "B"),
	            new Student("Sita", "C"),
	            new Student("Neha", "A"),
	            new Student("Karan", "B")
	        );

	
	//now group students based on grades
	 Map<String,List<Student>> grList=students.stream().collect(Collectors.groupingBy(Student::getGradString));
	 
System.out.println(grList);
	
	
	
}
}
