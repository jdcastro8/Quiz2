import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSumNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-7, calculator.sum(-3, -4));
    }

    @Test
    public void testSumWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(5, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-3, calculator.subtract(-8, -5));
    }

    @Test
    public void testSubtractWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.subtract(8, 0));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-24, calculator.multiply(-6, 4));
    }

    @Test
    public void testMultiplyByZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(6, 0));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    public void testDivideNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.divide(-20, 4));
    }

    @Test
    public void testIntegerDivision() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(7, 2));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void testIsEven() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEven(8));
    }

    @Test
    public void testIsOdd() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.isEven(7));
    }

    @Test
    public void testIsEvenWithZero() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEven(0));
    }

    @Test
    public void testIsEvenNegative() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEven(-4));
    }

    @Test
    public void testIsOddNegative() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.isEven(-7));
    }

}