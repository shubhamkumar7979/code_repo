package com.code.entity;

import java.util.stream.Collectors;

public class Main8 {
    public static void main(String[] args) {
        String input = "programming";
        String result = input.chars()
                .mapToObj(c -> (char)c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}