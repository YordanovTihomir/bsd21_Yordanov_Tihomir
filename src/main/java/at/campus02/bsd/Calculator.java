package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Calculator class contains computation logic
 */
public class Calculator {
    /**
     * default constructor for Calculator
     */
    public Calculator(){}

    /**
     * Logger which prints logs with debug, error, info...
     */
    Logger logger = LogManager.getLogger(at.campus02.bsd.Calculator.class);


    /**
     * method which adds 2 numbers
     * @param number1 first number of type double
     * @param number2 second number of type double
     * @return result of addition of the parameters in type double
     */
    public double add(double number1, double number2){
        logger.debug("Addition of " + number1 + " and " + number2);
        return number1 + number2;
    }

    /**
     * method which subtracts 2 numbers
     * @param number1 first number of type double
     * @param number2 second number of type double
     * @return result of subtraction of the parameters in type double
     */
    public double minus(double number1, double number2){
        logger.debug("Subtraction of " + number1 + " and " + number2);
        return number1 - number2;
    }

    /**
     * method which divides 2 numbers
     * @param number1 first number of type double
     * @param number2 second number of type double
     * @throws  ArithmeticException with comment 'Division by 0!' if the second number is 0
     * @return result of division of the parameters in type double
     */
    public double divide(double number1, double number2){
        if (number2 == 0) {
            logger.error("Division by 0!");
            throw new ArithmeticException("Division by 0!");
        }else {
            logger.debug("division of " + number1 + " and " + number2);
            return number1 / number2;
        }
    }

    /**
     * method which multiplies 2 numbers
     * @param number1 first number of type double
     * @param number2 second number of type double
     * @return result of multiplication of the parameters in type double
     */
    public double multiply(double number1, double number2){
        logger.debug("Multiplication of " + number1 + " and " + number2);
        return number1 * number2;
    }

    /**
     * method which compute factorial of a number
     * @param n integer input
     * @return factorial of the input n in integer type
     */
    public long factorial(int n){
        logger.debug("Factorial of " + n);
        if (n > 0){
            long f = 1;
            for (int i = n; i > 1; i--){
                f *= i;
            }return f;
        }
        else
            return 0;
    }
}
