package com.RaiSakshi.LeetCodeProblems.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1DArray {
        public static int[] runningSum(int[] num) {
            int sum=0;
            int l=num.length;
            int[]ans=new int [l];
            for(int i=0;i<num.length;i++){
                sum=sum+num[i];
                ans[i]=sum;
            }
            return ans;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of elements in the  array: ");
            int l=sc.nextInt();
            int[] num = new int [l];
            System.out.println("Enter elements of the array");
            for(int i=0;i<num.length;i++)
                num[i]=sc.nextInt();
            System.out.println("The new Array is "+ Arrays.toString(runningSum(num)));
        }
    }

