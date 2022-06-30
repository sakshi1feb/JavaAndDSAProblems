package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array ");
        int l = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[l];
        for (int i = 0; i < l; i++)
            arr[i] = sc.nextInt();
        System.out.println("Oridinal Array ="+Arrays.toString(arr));
        int start =0,end=l-1;
        while(start<end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array="+Arrays.toString(arr));
    }
}
