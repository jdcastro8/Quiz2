import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}