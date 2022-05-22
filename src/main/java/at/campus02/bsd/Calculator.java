package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Calculator {
    public Calculator() throws IOException {}

    Logger logger = LogManager.getLogger(at.campus02.bsd.Calculator.class);
    FileWriter fileWriter = new FileWriter(new File("logs/app.log"), true);


    public double add(double number1, double number2){
//        fileWriter.append(logger.debug("Addition of " + number1 + " and " + number2));
        logger.debug("Addition of " + number1 + " and " + number2);
        return number1 + number2;
    }
    public double minus(double number1, double number2){
        logger.debug("Subtraction of " + number1 + " and " + number2);
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        if (number2 == 0) {
            logger.error("Division by 0!");
            throw new ArithmeticException("Division by 0!");
        }else {
            logger.debug("division of " + number1 + " and " + number2);
            return number1 / number2;
        }
    }
    public double multiply(double number1, double number2){
        logger.debug("Multiplication of " + number1 + " and " + number2);
        return number1 * number2;
    }

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
