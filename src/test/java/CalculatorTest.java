import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple Addition")
    void testAdd() {
        assertEquals(6, calculator.add(4, 2), "4 + 2 should be 6");
        assertEquals(-2, calculator.add(-4, 2), "-4 + 2 should be -2");
    }

    @Test
    @DisplayName("Simple Subtraction")
    void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2), "4 - 2 should be 2");
        assertEquals(4, calculator.subtract(5, 1), "5 - 1 should be 4");
    }

    @Test
    @DisplayName("Simple Division")
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should be 2");

    }

    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }


}// end calc test
