package at.campus02.bsd.main;

import at.campus02.bsd.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,5));
        System.out.println(calculator.minus(2,5));
        System.out.println(calculator.divide(2,0));
        System.out.println(calculator.multiply(2,5));

    }
}
