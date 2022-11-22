import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;
    private double firstNumber;
    private double secondNumber;
    private double result;


    @BeforeEach
    public void initTest() {
        calculator = new Calculator();
    }

    @AfterEach
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testAddition() {

        calculator = new Calculator();
        firstNumber = 10;
        secondNumber = 10;

        result = calculator.addition(firstNumber, secondNumber);

        assertEquals(20, result);
    }

    @Test
    public void testSubtraction() {
        calculator = new Calculator();
        firstNumber = 10;
        secondNumber = 10;

        result = calculator.subtraction(firstNumber, secondNumber);
        assertEquals(0, result);
    }
    @Test
    public void testMultiplication(){
        calculator = new Calculator();

    }

    @Test
    public void testDivision() {
        calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.division(8, 0));
        assertEquals("division by zero", exception.getMessage());
    }
}