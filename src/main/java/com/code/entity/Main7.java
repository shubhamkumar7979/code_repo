package com.code.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main7 {

    // ["eat","tea","tan","ate","nat","bat"]
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String >> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);
    }
}
