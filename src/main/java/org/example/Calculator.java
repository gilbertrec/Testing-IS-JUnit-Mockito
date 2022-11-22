package org.example;

public class Calculator {

    private DoubleMath integerMath;

    public double addition(double firstNumber, double secondNumber) {
        integerMath = (p1, p2) -> p1 + p2;
        return integerMath.operation(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        integerMath = (p1, p2) -> p1 - p2;
        return integerMath.operation(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        integerMath = (p1, p2) -> p1 * p2;
        return integerMath.operation(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("division by zero");
        }
        integerMath = (p1, p2) -> p1 / p2;
        return integerMath.operation(firstNumber, secondNumber);
    }
}