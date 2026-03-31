package collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Employee{
	String nameString;
	String depString;
	double salary;
	
	public Employee(String nameString,String depString,double salary) {
		this.nameString=nameString;
		this.depString=depString;
		this.salary=salary;
	}
	
	public String getDepString() {
		return depString;
	}
	public String getNameString() {
		return nameString;
	}
	public double getSalary() {
		return salary;
	}
	
}

public class SalaryCategory {
public static void main(String[] args) {
	List<Employee>dataEmployees=List.of(
			  new Employee( "Aman", "IT", 50000),
	            new Employee( "Ravi", "HR", 40000),
	            new Employee( "Sita", "IT", 60000),
	            new Employee( "Neha", "HR", 45000),
	            new Employee("Karan", "Sales", 30000)
	        );
	
	//group by department and calculate average salary
	Map<String, Double>ls=dataEmployees.stream()
			.collect(Collectors.groupingBy(
					Employee::getDepString,
			Collectors.averagingDouble(Employee::getSalary)));
	
	ls.
	forEach((name,dept)->
	System.out.println(name+" -> "+dept));
			
	
	
	
}


}
