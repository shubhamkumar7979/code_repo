package com.code.test;

import java.util.ArrayList;
import java.util.List;

public class B {
    public static void main(String[] args) {
        String inputString = "abbabc";
        List<String> palindromesNumbers = findPalindromes(inputString);

        // Join the palindromes with commas and print them
        String result = String.join(", ", palindromesNumbers);
        System.out.println("Palindromes: " + result);
    }

    public static List<String> findPalindromes(String str) {
        List<String> palindromesNumbers = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);

                if (isPalindrome(substring)) {
                    palindromesNumbers.add(substring);
                }
            }
        }
        return palindromesNumbers;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
