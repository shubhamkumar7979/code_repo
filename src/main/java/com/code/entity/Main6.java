package com.code.entity;

import java.util.stream.Collectors;

public class Main6 {

    public static void main(String[] args){
        String input = "Apple";
        String result = input.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c ))
                        .collect(Collectors.joining());

        System.out.println(result);
    }
}
