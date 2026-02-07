package com.code.test;



//List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");
//
//output : {3=[Bob, Eve], 4=[Dave], 5=[Alice], 7=[Charlie]}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {


    // {3=2, 4=1, 5=1, 7=1}

    //3==2

    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

        Map<Integer, Long> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(groupedByLength);

    }
}
