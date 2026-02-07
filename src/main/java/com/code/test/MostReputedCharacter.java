package com.code.test;

import java.util.HashMap;
import java.util.Map;

public class MostReputedCharacter {
    public static void main(String[] args) {
        String inputString = "YOUR_INPUT_STRING_HERE";  // Replace with your input string
        char mostReputedCharacter = findMostReputedCharacter(inputString);  // Find Most Reputed Character:
        int occurrenceCount = countOccurrences(inputString, mostReputedCharacter);  // Count Occurrences:

        System.out.println("Most reputed character: " + mostReputedCharacter);  //  Print Results:
        System.out.println("Number of occurrences: " + occurrenceCount);  //  Print Results:
    }
    private static char findMostReputedCharacter(String str) {  // Find Most Reputed Character Method:
        Map<Character, Integer> charFrequency = new HashMap<>();  // Character Frequency Map:

        for (char c : str.toCharArray()) {  //  Count Character Frequencies:
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        char mostReputed = ' ';
        int maxOccurrences = 0;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {  // Find Most Reputed Character Loop:
            if (entry.getValue() > maxOccurrences) {
                mostReputed = entry.getKey();
                maxOccurrences = entry.getValue();
            }    }
        return mostReputed;  // Return Most Reputed Character:
    }
    private static int countOccurrences(String str, char target) {  // Count Occurrences Method:
        int count = 0;
        for (char c : str.toCharArray()) {  //Count Occurrences Loop:
            if (c == target) {
                count++;
            }    }
        return count;  // Return Occurrence Count:
    }  }

