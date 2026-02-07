package com.code.entity;

//axcdfcsshshdkadjqwertucxlsdf
public class Main2 {
    public static void main(String[] srgs){
        String s ="axcdfcsshshdkadjqwertucxlsdf";

        System.out.println("Longest character" + longestSubStrinng(s));

    }

    public  static String  longestSubStrinng(String s){
        int left = 0,
                 right = 0;
        int maxLen = 0, start = 0;
        int[] chars = new int[128];  ///

        while(right <s.length()){
            char c = s.charAt(right);
            if(chars[c] ++> 0){
                while (chars[c] >1){
                    chars[s.charAt(left)] --;
                    left++;
                }
            }

            if(maxLen < right - left + 1){
                maxLen =right - left + 1;
                start = left;
            }
            right++;
        }
        return s.substring(start, start +maxLen);
    }
}
