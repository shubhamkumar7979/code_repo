package com.code.test;

public class PrintPattern {
    public static void main(String[] args) {
        char currentChar = '1';

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar);
            }
            // Increment the character for the next iteration
            currentChar++;
            // Print a newline character to move to the next line
            System.out.println();
        }
    }
}

