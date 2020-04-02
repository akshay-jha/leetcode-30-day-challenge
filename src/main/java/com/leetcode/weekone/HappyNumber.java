package com.leetcode.weekone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
