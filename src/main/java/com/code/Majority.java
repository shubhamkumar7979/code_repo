package com.code;

//Find the element that appears more than ⌊n / 2⌋ times.
//
//        Input: [3, 3, 4, 2, 3]
//Output: 3
//note: n = the length of the array


public class Majority {
    public static void main(String[] args){
        int[] nums = {3,3,4,2,3};
        System.out.println(findMajority(nums));
    }

    public static int findMajority(int[] nums){
        int count = 0, candidate =0;

        // Find Condition

        for (int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Validation Check
        count = 0;
        for (int num : nums){
            if (num == candidate) count++;
        }

        if(count > nums.length / 2){
            return  candidate;
        } else  {
            return -1;
        }
    }
}
//candra