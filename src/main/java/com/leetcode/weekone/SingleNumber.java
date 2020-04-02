package com.leetcode.weekone;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i = i + 2) {
            if ((i+1) == nums.length || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] numbers = new int[]{4, 1, 2, 1, 2};
        int singleNumber = s.singleNumber(numbers);
        System.out.println(singleNumber);
    }
}
