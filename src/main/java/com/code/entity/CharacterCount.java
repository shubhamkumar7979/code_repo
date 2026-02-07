package com.code.entity;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args){
        String str = "hello World";
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("Character count: " + map);
    }

}


