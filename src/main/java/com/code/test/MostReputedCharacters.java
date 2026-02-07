package com.code.test;

import java.util.HashMap;
import java.util.Map;

public class MostReputedCharacters {
    public static void main(String[] args) {
        String input = "AAAAAARBCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Create a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the input string and count character occurrences
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        // Initialize variables to keep track of the most reputed character and its count
        char mostReputedChar = '\0';
        int maxCount = 0;

        // Iterate through the map to find the most reputed character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostReputedChar = currentChar;
            }    }

        if (mostReputedChar != '\0') {  // Display the Result:
            System.out.println("Most reputed character: " + mostReputedChar);
            System.out.println("Number of times it occurs: " + maxCount);
        } else {
            System.out.println("No characters found in the input.");
        }  }   }
