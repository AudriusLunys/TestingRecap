package Example3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private static CalculatorService calculatorService;

    @BeforeAll
    public static void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void add() {
        // CalculatorService calculatorService = new CalculatorService();
        int actualResult = calculatorService.add(3, 5);
        assertEquals(8, actualResult);
    }

    @Test
    void subtract() {
        // CalculatorService calculatorService = new CalculatorService();
        int actualresult = calculatorService.subtract(1253, 1255);
        assertEquals(-2, actualresult);
    }

    @Test
    void multiply() {
        int actualresult = calculatorService.multiply(5, 0);
        assertEquals(0, actualresult);
    }

    @Test
    void divide() {
        int actualResult = calculatorService.divide(9, 3);
        assertEquals(3, actualResult);
    }

    @Test
    void testFindMax() {
        int[] arejus = {1, 2, 3, 4, 5};
        int actualMax = calculatorService.findMax(arejus);
        assertEquals(5, actualMax);
    }

    @Test
    void exceptionTest() {
        ArithmeticException arithmeticException = assertThrows(
                ArithmeticException.class, () -> calculatorService.divide(5, 0),
                "Expected to throw an exceptoin, but it didn't"
        );
        assertTrue(arithmeticException.getMessage().contains("by zero"));
    }

}
