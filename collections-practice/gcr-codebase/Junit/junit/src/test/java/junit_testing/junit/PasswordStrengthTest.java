package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {

	PasswordStrength passwordStrength=new PasswordStrength();
	
	@Test
	public void passwordTest() {
		boolean t=passwordStrength.strengthCheck("abcdefgh");
		
		assertEquals(false, t);
	}
	
	
}
