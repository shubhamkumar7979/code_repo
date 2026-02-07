package com.code.test;

import java.util.ArrayList;
import java.util.List;

public class A {
    public static void  main (String[] args){
        // String str = "abbabc"

        String inputString = "abbabc";
        List<String> palindromesNumbers = findPalindromes(inputString);

        System.out.println("palindromes number" + palindromesNumbers);

    }
    public  static  List<String> findPalindromes(String str){

        List<String> palindromesNumbers = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            for(int j = i +1; j <= str.length(); j++){

                String substring = str.substring(i , j);

                if (isPalindrome(substring)){
                    palindromesNumbers.add(substring);
                }
            }
        }
        return  palindromesNumbers;
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return  true;
    }
}
