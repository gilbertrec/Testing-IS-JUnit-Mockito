package org.example;

public class Calculator {

    PowerCalc pc;
    // Costruttore d'esempio per JUnit
    public Calculator(){

    }

    // Costruttore d'esempio per Mockito
    public Calculator(PowerCalc pc){
        this.pc = pc;
    }

    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
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

    public double pow(double firstNumber,double secondNumber){
        return pc.power(firstNumber,secondNumber);
    }
}