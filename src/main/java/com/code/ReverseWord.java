package com.code;

import java.util.Arrays;

//Input : "My name is Shubham"
//Output : "Shubham is name My"
public class ReverseWord {
    public static void main(String[] args){
        String str  = "My name is Shubham";

        String output = Arrays.stream(str.split(" "))
                .reduce((a,b) -> b + " " + a)
                .orElse("");
        System.out.println(output);
    }

}
