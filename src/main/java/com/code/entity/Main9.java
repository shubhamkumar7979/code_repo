package com.code.entity;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


import java.util.TreeMap;

class Main9 {
    public static void main(String[] args) {
        String str  = "Programmingg";

        //  Map<Character, Long> charChount =
        str.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))

                .entrySet()
                .stream()
                .sorted(
                        Map.Entry.<Character,Long> comparingByValue().reversed()
                                .thenComparing(Map.Entry.comparingByKey()))
                .forEach((e ->  System.out.println(e.getKey() + "->" + e.getValue()) ));



    }
}