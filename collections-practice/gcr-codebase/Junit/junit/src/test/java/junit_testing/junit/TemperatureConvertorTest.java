package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureConvertorTest {

	TemperatureConvertor temperatureConvertor=new TemperatureConvertor();
	
	@Test
	public void  celsiusToFahrenheitTest() {
		double result = temperatureConvertor.celsiusToFahrenheit(100);
		
		assertEquals(212,result);
		
	}
	
	@Test
public void  fahrenheitToCelsiusTest() {
	
	double result=temperatureConvertor.fahrenheitToCelsius(32);
	
	assertEquals(0, result);
	
	}
	
}
