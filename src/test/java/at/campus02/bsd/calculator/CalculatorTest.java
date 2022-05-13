package at.campus02.bsd.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    double test1,test2,result1,result2;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

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

    @Test
    @DisplayName("Divide 2 numbers if 0 print string")
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
        assertEquals(0, calculator.divide(1,0));
    }

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

    @Test
    @DisplayName("calculate factorial")
    void factorial(){
        assertEquals(0,calculator.factorial(-1));
        assertEquals(0,calculator.factorial(0));
        assertEquals(120,calculator.factorial(5));
        assertEquals(1,calculator.factorial(1));
    }
}