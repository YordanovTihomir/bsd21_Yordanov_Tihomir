package at.campus02.bsd;

/**
 * Main Class which contains main-method
 * @author Tihomir Yordanov
 */
public class Main {

    /**
     * Main method to start the program
     * @param args program arguments (could be empty)
     * @throws ArithmeticException if number is divided by 0 => IGNORED
     */
    public static void main(String[] args) {
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
