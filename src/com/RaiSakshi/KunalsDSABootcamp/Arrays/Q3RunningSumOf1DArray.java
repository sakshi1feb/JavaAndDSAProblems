package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.*;
public class Q3RunningSumOf1DArray {
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
        Scanner sc=new Scanner (System.in);
        int[] num = new int [10];
        for(int i=0;i<num.length;i++)
            num[i]=sc.nextInt();
        System.out.println("The new Array is "+ Arrays.toString(runningSum(num)));
    }
}
