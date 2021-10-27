package com.company;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] answerArray = new int[2];
        for (int i = 0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answerArray[0] = i;
                    answerArray[1] = j;
                }
            }
        }
        return answerArray;
    }
}
