import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(8, calc.add(3, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}