package com.example.pplibrary;

public class PPMathOperations {

    // 简单的加法方法
    public static int add(int a, int b) {
        return a + b;
    }

    // 简单的减法方法
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 简单的乘法方法
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 简单的除法方法
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}