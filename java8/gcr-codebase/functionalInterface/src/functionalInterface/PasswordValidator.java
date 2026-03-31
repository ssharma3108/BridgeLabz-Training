package functionalInterface;

import java.util.Scanner;

interface SecurityUtils{
	static void checkPassword(String input) {
	}	
}


class Checker implements SecurityUtils{
	
	
	static void checkPassword(String input) {
		String matcheString ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#%$])[A-Za-z0-9]{8}$";
		
		if(input.matches(matcheString)) {
			System.err.println("Password is strong");
		}else {
			System.out.println("Password is weak");
		}
		
	}
	
}



public class PasswordValidator {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	Checker checker=new Checker();
	
	checker.checkPassword("abc123");
}
}
