package lambdaExpression;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HospitalIDPrinting {
public static void main(String[] args) {
	List<Integer> ls=Arrays.asList(101, 102, 103, 104, 105);
	
	if(ls.isEmpty()) {
		System.out.println("No patient IDs found for verification\r\n");
	}
	
	//print all the id...
	ls.stream().forEach(System.out::println);
		
}
}
