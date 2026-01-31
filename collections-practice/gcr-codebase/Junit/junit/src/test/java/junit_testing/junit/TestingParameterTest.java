package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestingParameterTest {

	TestingParameter tp=new TestingParameter();
	
	
	@Test
	public void isEvenTest() {
		boolean one =tp.isEven(2);
		boolean two=tp.isEven(4);
		boolean three =tp.isEven(5);
		
		
		assertEquals(true, one);
		assertEquals(true, two);
		assertEquals(false, three);
	
		
		
	}
	
	
}
