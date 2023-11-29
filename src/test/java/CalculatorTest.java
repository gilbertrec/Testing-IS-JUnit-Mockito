import org.example.Calculator;
import org.example.PowerCalc;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;

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

        firstNumber = 10;
        secondNumber = 10;

        result = calculator.addition(firstNumber, secondNumber);

        assertEquals(20, result);
    }

    @Test
    public void testSubtraction() {
        firstNumber = 10;
        secondNumber = 10;

        result = calculator.subtraction(firstNumber, secondNumber);
        assertEquals(0, result);
    }
    @Test
    public void testMultiplication(){

    }

    @Test
    public void testAddizione() {
        double risultato = calculator.addition(3, 5);
        assertEquals(8, risultato);
    }

    @Test
    public void testSottrazione() {
        double risultato = calculator.subtraction(8, 3);
        assertEquals(5, risultato);
    }

    @Test
    public void testDivision() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.division(8, 0));
        assertEquals("division by zero", exception.getMessage());
    }

    @Test
    public void testMockitoPower() {
        //Given
        PowerCalc pc = Mockito.mock(PowerCalc.class);
        firstNumber = 5;
        secondNumber = 5;
        Mockito.when(pc.power(firstNumber,secondNumber)).thenReturn(25.0);
        //When
        Calculator c1 = new Calculator(pc);
        double risultato = c1.pow(firstNumber,secondNumber);
        //Then
        assertEquals(25,risultato);

    }

}