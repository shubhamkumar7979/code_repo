package com.code.test;

import java.util.Arrays;

public class NthLargestNumber {

    public static int findNthLargest(int[] nums, int n) {
        if (nums == null || nums.length < n) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Sort the array in descending order
        Arrays.sort(nums);
        int length = nums.length;

        // The Nth largest element will be at index length - n
        return nums[length - n];
    }

    public static void main(String[] args) {
        int[] arr = { 45, 8, 12, 5, 21};
        int n = 3; // Find the 3rd largest number

        int nthLargest = findNthLargest(arr, n);
        System.out.println("The " + n + "th largest number is: " + nthLargest);
    }
}
