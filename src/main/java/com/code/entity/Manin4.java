package com.code.entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        10,15,8,49,25,98,32
public class Manin4 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> result = list.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
