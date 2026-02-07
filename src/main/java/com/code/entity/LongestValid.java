package com.code.entity;


//Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.
//Example 1:
//
//Input: s = "(()"
//Output: 2
//Explanation: The longest valid parentheses substring is "()".
//Example 2:
//
//Input: s = ")()())"
//Output: 4
//Explanation: The longest valid

public class LongestValid {

    public static int longestValidParentheses(String s){

        int left = 0;
        int right = 0;
        int maxLength = 0;

        for(char c: s.toCharArray()){
            if(c == '(') left ++;
            else right ++;

            if(left == right){
                maxLength = Math.max(maxLength, 2* right);
            } else  if (right > left){
                left = right = 0;
            }
        }

        for ( int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(c == '(') left++;
            else  right++;

            if(left == right){
                maxLength = Math.max(maxLength, 2*left);
            } else if(left > right){
                left = right = 0;
            }
        }

        return maxLength;
    }

    public  static void main(String[] args){
        System.out.println(longestValidParentheses("()("));

        System.out.println(longestValidParentheses(")()())"));
    }
}
