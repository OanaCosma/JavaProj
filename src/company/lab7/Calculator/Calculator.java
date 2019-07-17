package company.lab7.Calculator;

public class Calculator {

    public int modulo(int a, int b) {
        int result = a % b;
        return result;
    }

    public float modulo(float a, float b){
        float result=a%b;
        return result;
    }

    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public float sum(float first, float second) {
        return first + second;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public double multiply(double a, double b, double c){
        double result=a * b * c;
        return result;
    }

    public int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public float division(float firstNumber, int secondNumber){
        float result = firstNumber / secondNumber;
        return result;
    }


    public int substract(int a, int b) {
        int result = a - b;
        return result;
    }

    public float substract(int x, float y){
        float result = x - y;
        return result;
    }

}
