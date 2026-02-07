package com.code.entity;

public class CharacterCount01 {
    public static void main(String[] args){
        String str = "Hello World";
        int[] count = new int[256];

        for(char ch : str.toCharArray()){
            count[ch]++;

            // h = ASC|| values 104
            // e = 101
            //
        }

        for(int i =0; i < 256; i++){
            if(count[i] > 0){
                System.out.println((char) i + "=" +count[i]);
            }
        }
    }
}
