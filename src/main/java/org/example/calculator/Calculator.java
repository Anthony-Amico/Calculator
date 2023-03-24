package org.example.calculator;

public class Calculator {

    public int addition(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public float subdivision(int a, int b) {
        if (b==0) throw new ArithmeticException("Division by 0 is not allowed");
        return a/b;
    }
}
