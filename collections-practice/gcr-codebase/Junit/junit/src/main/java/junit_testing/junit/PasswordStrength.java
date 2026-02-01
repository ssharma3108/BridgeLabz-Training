package junit_testing.junit;

public class PasswordStrength {

	
	public boolean strengthCheck(String s) {
		
		String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$";
		boolean perfect=false;
		
		
		if(s.matches(regex)) {
			perfect=true;
		}
		return perfect;
		
	}
	
}
