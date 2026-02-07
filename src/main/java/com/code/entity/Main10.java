package com.code.entity;


//("Hi Good Morning" , "Hello" , "this is a java app")
//find the count of duplicate characters from the list

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main10 {

    public static  void main(String[] args){
        List<String> list = Arrays.asList("Hi Good Morning" , "Hello" , "this is a java app");
        Map<Character, Long> charCount = list.stream()
                .flatMap(s-> s.chars().mapToObj(c-> (char) c))
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        charCount.entrySet().stream()
                .filter(e -> e.getValue() >1)
                .forEach(e -> System.out.println(e.getKey() + "-> " + e.getValue()));
    }
}
