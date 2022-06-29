package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumItem {
    // A program to input an array and display the maximum number in the array.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array ");
        int l=sc.nextInt();
        int[] arr= input(l);
        System.out.println(Arrays.toString(arr));
        int max=max(arr);
        System.out.println("The maximum element of the array is "+max);
    }
   static int[] input(int l){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max)
                max=arr[i];
        }
        return max;
    }
}