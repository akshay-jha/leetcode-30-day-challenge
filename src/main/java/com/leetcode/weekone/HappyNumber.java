package com.leetcode.weekone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */

public class HappyNumber {

    public boolean isHappy(int n) {
        int num = n;
        int sum = 0;
        List<Integer> sumList = new ArrayList<>();

        while (sum != 1) {
            if (sum != 0) {
                num = sum;
                if (sumList.contains(sum)) {
                    return false;
                }
                sumList.add(sum);
                sum = 0;
            }
            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, 2);
                num = num / 10;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int number = s.nextInt();

        if(happyNumber.isHappy(number)) {
            System.out.println(number + " is a happy number");
        } else {
            System.out.println(number + " is not a happy number");
        }
    }
}
