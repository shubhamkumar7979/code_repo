package com.code.test;

// Functional interface with a single abstract method
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Calculator interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + addition.calculate(num1, num2));       // Output: Addition: 15
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2)); // Output: Subtraction: 5
    }
}
