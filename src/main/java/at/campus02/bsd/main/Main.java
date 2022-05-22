package at.campus02.bsd.main;

import at.campus02.bsd.Calculator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        Configurator.setRootLevel(Level.DEBUG);

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,5));
        System.out.println(calculator.minus(2,5));
        try {
            System.out.println(calculator.divide(2,0));
        } catch (ArithmeticException ignore){}
        try {
            System.out.println(calculator.divide(2,6));
        } catch (ArithmeticException ignore){}
        System.out.println(calculator.multiply(2,5));
        System.out.println(calculator.factorial(5));
    }
}
