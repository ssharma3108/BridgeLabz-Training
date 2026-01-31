package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void addTest() {
        int actual = c.addMethod(10, 20);
        assertEquals(30, actual);
    }

    @Test
    public void subtractTest() {
        int actual = c.subtractMethod(50, 30);
        assertEquals(20, actual);
    }

    @Test
    public void multiplyTest() {
        int actual = c.multiplyMethod(10, 20);
        assertEquals(200, actual);
    }

    @Test
    public void divideTest() {
        int actual = c.divideMethod(100, 20);
        assertEquals(5, actual);
    }

    @Test
    public void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> {
            c.divideMethod(10, 0);
        });
    }
}
