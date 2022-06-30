package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int l=sc.nextInt();
        int [] arr=new int[l];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        int ans=search(arr,target);
        if(ans==-1)
            System.out.println("Target element not found in the array.");
        else
            System.out.println("Target element found at "+ans+" index in the array");

    }
    static int search(int[] arr, int target){
        if(arr.length==0)
            return -1;
        else{
            for(int i=0;i<arr.length;i++)
                if(arr[i]==target)
                    return i;
        }
        return -1;
    }
}
