//package com.code.entity;
//
//import java.util.*;
//import java.util.stream.*;
//
//public class PairSum{
//    public static void main(String [] args){
//        int[] arr = {4, 5, 2, 10, 8};
//        int target = 15;
//
//        List<List<Integer>> pairs = Integer = IntStream.range(0,arr.length)
//                .boxed()
//                .flatMap(i -> IntStream.range(i + 1, arr.length)
//                                .filter(j -> arr[i] + arr[j] == target)
//                        mapToObj(j -> Arrays.asList(arr[i], arr[j]))
//                                .collect(Collectors.toList());
//
//        System.out.println(pairs);
//
//    }
//}