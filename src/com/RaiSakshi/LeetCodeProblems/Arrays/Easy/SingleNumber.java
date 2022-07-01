package com.RaiSakshi.LeetCodeProblems.Arrays.Easy;

import java.util.Scanner;

public class SingleNumber {
    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,2,1]
     * Output: 1
     * Example 2:
     *
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     * Example 3:
     *
     * Input: nums = [1]
     * Output: 1
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 3 * 104
     * -3 * 104 <= nums[i] <= 3 * 104
     * Each element in the array appears twice except for one element which appears only once.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int l = sc.nextInt();
        int[] nums = new int[l];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < l; i++)
            nums[i] = sc.nextInt();
        int ans = singleNumber(nums);
        if (ans == -1)
            System.out.println("All the numbers are repeated twice.");
        else
            System.out.println("The number which is not repeated in the array is " + ans);
    }

     static int singleNumber(int[] nums) {
         int count = 0, assign;
         for (int i = 0; i < nums.length; i++) {
             assign = nums[i];
             for (int j = 0; j < nums.length; j++) {
                 if (nums[j] == assign)
                     count++;
             }
             if (count != 2)
                 return nums[i];
             count = 0;
         }
         return -1;
     }
     }

