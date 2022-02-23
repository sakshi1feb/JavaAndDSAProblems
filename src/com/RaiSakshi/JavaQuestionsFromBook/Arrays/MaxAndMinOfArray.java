package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int max=arrayMax(arr);
        int min=arrayMin(arr);
        System.out.println("The largest number in the array is "+max);
        System.out.println("The smallest number in the array is "+min);
    }
    static int  arrayMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int arrayMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<min)
                min=arr[i];
            }
        return min;
        }
    }

