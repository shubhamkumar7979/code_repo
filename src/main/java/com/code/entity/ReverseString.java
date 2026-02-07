package com.code.entity;

public class ReverseString {

    // Method to reverse a string
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();   // StringBuilder reverses the string efficiently
    }

    public static void main(String[] args) {
        String input = "Shu";
        String reversed = reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
