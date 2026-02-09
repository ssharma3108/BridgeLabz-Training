package collectors;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;

class Customer{
	String nameString;
	double amount;
	
	public Customer(String nameString,int amount) {
		this.nameString=nameString;
		this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}
	public String getNameString() {
		return nameString;
	}
	
	
}

public class OrderRevenueSummary {
public static void main(String[] args) {
	List<Customer> ls=List.of(
			new Customer("Amit", 2500),
			new Customer("Neha", 3000),
			new Customer("Amit", 3500),
			new Customer("Neha", 4000),
			new Customer("Rohit", 4500));
	
	// Calculate order revenue per customer
    Map<String, Double> calMap = ls.stream()
        .collect(Collectors.groupingBy(
           Customer::getNameString,
            Collectors.summingDouble(Customer::getAmount)
        ));

    // Print results
    calMap.
    forEach((name, revenue) -> 
        System.out.println(name + " -> " + revenue));
}
}

