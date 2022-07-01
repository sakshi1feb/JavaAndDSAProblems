package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < l; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the element to be searched ");
        int target = sc.nextInt();
        System.out.println("Enter the starting and ending range for the element to be searched: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean ans= searchInRange(arr, target, start, end);
        if(ans==true)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
    static boolean searchInRange(int[]arr, int target, int start, int end){
        for(int i=start;i<end;i++)
            if(arr[i]==target)
                return true;
            return false;
    }
}
