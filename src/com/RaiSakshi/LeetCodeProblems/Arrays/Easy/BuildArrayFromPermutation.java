package com.RaiSakshi.LeetCodeProblems.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
        public static  int[] buildArray(int[] nums) {
            int len=nums.length;
            int[] arr= new int[len];
            for(int i=0;i<len;i++){
                arr[i]=nums[nums[i]];
            }
            return arr;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter length of the array: ");
            int l=sc.nextInt();
            int[] arr=new int [l];
            System.out.println("Enter the elements of the array:-");
            for(int i=0;i< arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("The new changed array is "+ Arrays.toString((arr)));
        }
    }

