
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, 2 + 3, "Addition should be correct");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, 3 - 2, "Subtraction should be correct");
    }

    @Test
    void testMultiplication() {
        assertEquals(6, 2 * 3, "Multiplication should be correct");
    }

    @Test
    void testDivision() {
        assertEquals(2, 6 / 3, "Division should be correct");
    }

    @Test
    void testBoolean() {
        assertTrue(5 > 1, "5 is greater than 1");
    }
}
