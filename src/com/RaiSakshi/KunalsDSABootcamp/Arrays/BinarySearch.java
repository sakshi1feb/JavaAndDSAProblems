package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int l=sc.nextInt();
        int [] arr=new int[l];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element to be searched");
        int target=sc.nextInt();
       int  ans=binarySearch(arr,target);
        System.out.println("The element is found at "+ans+" index");
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length;
        while(start< end){
            int mid=start +(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start=mid+1;
            else if(arr[mid]>target)
                end=mid-1;
        }
        return -1;//If element not found
    }
}
