package at.campus02.bsd.main;

import at.campus02.bsd.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private final static Logger logger = LogManager.getLogger();

    // Log messages
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,5));
        logger.info("Welcome to calculator.");
        System.out.println(calculator.minus(2,5));
        System.out.println(calculator.divide(2,0));
        logger.error("Error bei division!");
        System.out.println(calculator.multiply(2,5));

    }
}
