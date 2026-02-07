package com.code.entity;


//s="anagaram" ; t="nagaram"


import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        char[] arr1 = s.toLowerCase().toCharArray();
        char[] arr2 = s.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

}
