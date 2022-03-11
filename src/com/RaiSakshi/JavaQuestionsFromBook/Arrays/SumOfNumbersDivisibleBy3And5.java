package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

public class SumOfNumbersDivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements of the array:-");
       for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
        int sum= sumOfNos(arr);
        System.out.println("The sum of the numbers from the array which are divisible by 3 or 5 are: "+sum);
    }

    static int sumOfNos(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 3 == 0 || arr[i] % 5 == 0)
                sum=sum+arr[i];
        }
        return sum;
    }
}


/*
 n=3
 arr.length =6
 [1,2,3,4,7,8]
 [1,4,2,7,3,8]
 */