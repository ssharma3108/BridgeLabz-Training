package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilTesting {

	StringUtil stringUtil=new StringUtil();
	
	@Test
	public void  reverseTest() {
		String s=stringUtil.reverse("shivam");
		
		assertEquals("mavihs", s);
	}
	
	@Test
	public void palindromeTest() {
		boolean s=stringUtil.isPalindrome("naman");
		
		assertEquals(true, s);
	}
	
	@Test
	public  void uppercaseTest() {
		String s=stringUtil.toUppaercase("shivam");
		
		assertEquals("SHIVAM", s);
	}

}
