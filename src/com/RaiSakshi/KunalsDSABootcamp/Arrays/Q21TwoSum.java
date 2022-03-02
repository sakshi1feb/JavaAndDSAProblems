package com.RaiSakshi.KunalsDSABootcamp.Arrays;

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they
     up to target.You may assume that each input would have exactly one solution, and you may not use the same
      element twice.You can return the answer in any order.

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */

import java.util.Scanner;

public class Q21TwoSum {
    static public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int[] out=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    out[0]=i;
                    out[1]=j;
                    return out;
                }
            }

        }
        return null;
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int[] nums=new int[10];
        System.out.println("Enter the elements of the araay");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target value");
        int target=sc.nextInt();
        System.out.println("The output elements are:"+twoSum(nums,target));
    }
}


