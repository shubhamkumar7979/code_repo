package com.code.entity;

public class MAxNumber {
    public static void main(String[] args){

        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar = arr[0];

        int currentSum = 0;

        for(int num : arr){
            currentSum += num;
            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
            }

            if(currentSum <  0){
                currentSum = 0;

            }
        }


        System.out.println("Maxmun sum number : " + maxSoFar);
    }
}
