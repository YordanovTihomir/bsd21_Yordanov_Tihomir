package at.campus02.bsd.calculator;

import at.campus02.bsd.Calculator;
import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test class for calculator class
 */
class CalculatorTest {

    Calculator calculator;
    double test1,test2,result1,result2;

    /**
     * Set an instance of calculator everytime when test is started
     */
    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    /**
     * Test with name "Add 2 numbers" checking method add(n1,n2)
     * covers 100%
     */
    @Test
    @DisplayName("Add 2 numbers")
    void add() {
        result1 = calculator.add(4,5);
        result2 = calculator.add(11.1,9.4);
        test1 = 4+5;
        test2 = 11.1+9.4;
        assertEquals(test1, result1);
        assertEquals(test2, result2);
        test1 = 9.0;
        test2 = 20.5;
        assertEquals(test1, result1);
        assertEquals(test2, result2);

    }


    /**
     * Test with name "Subtract 2 numbers" checking method minus(n1,n2)
     * covers 100%
     */
    @Test
    @DisplayName("Subtract 2 numbers")
    void minus() {
        result1 = calculator.minus(6,10);
        result2 = calculator.minus(10.2,5);
        test1 = 6-10;
        test2 = 10.2-5;
        assertEquals(test1, result1, 0.01);
        assertEquals(test2, result2, 0.01);
        test1 = -4;
        test2 = 5.2;
        assertEquals(test1, result1, 0.01);
        assertEquals(test2, result2, 0.01);
    }

    /**
     * Test with name "Divide 2 numbers" checking method divide(n1,n2)
     * covers 100%
     */
    @Test
    @DisplayName("Divide 2 numbers")
    void divide() {
        result1 = calculator.divide(6,10);
        result2 = calculator.divide(10.2,5);
        test1 = 6.0/10.0;
        test2 = 10.2/5;
        assertEquals(test1, result1, 0.01);
        assertEquals(test2, result2, 0.01);
        test1 = 0.6;
        test2 = 2.04;
        assertEquals(test1, result1, 0.01);
        assertEquals(test2, result2, 0.01);
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }


    /**
     * Test with name "multiply 2 numbers" checking method multiply(n1,n2)
     * covers 100%
     */
    @Test
    @DisplayName("multiply 2 numbers ")
    void multiply() {
        result1 = calculator.multiply(6,10);
        result2 = calculator.multiply(10.2,5);
        test1 = 6.0*10.0;
        test2 = 10.2*5;
        assertEquals(test1, result1, 0.01);
        assertEquals(test2, result2, 0.01);
        test1 = 60;
        test2 = 51.0;
        assertEquals(test1, result1, 0.01);
        assertEquals(test2, result2, 0.01);
    }

    /**
     * Test with name "calculate factorial" checking method factorial(n1,n2)
     * covers 100%
     */
    @Test
    @DisplayName("calculate factorial")
    void factorial(){
        assertEquals(0,calculator.factorial(-1));
        assertEquals(0,calculator.factorial(0));
        assertEquals(120,calculator.factorial(5));
        assertEquals(1,calculator.factorial(1));
    }
}