package org.example;

public class Calculator {


    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("division by zero");
        }
        return firstNumber / secondNumber;
    }
}