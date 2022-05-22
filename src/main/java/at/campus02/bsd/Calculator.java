package at.campus02.bsd;

public class Calculator {

    public Calculator(){}

    public double add(double number1, double number2){
        return number1 + number2;
    }
    public double minus(double number1, double number2){
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        if (number2 == 0) {
            System.out.println("Division by 0 is not possible!");
            return 0;
        }else return number1 / number2;
    }
    public double multiply(double number1, double number2){
        return number1 * number2;
    }

    public long factorial(int n){
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
