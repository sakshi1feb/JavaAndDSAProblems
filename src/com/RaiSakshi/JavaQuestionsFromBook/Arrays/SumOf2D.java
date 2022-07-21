package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

/*
Write a program in java to store the numbers in a 3 by 4 matrix in a double dimensional array. Find the sum of
all the numbers of the matrix and display the sum.
 */
public class SumOf2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int [][] arr=new int [3][4];
        System.out.println("Enter the elements of the 3 by 4 array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                sum+=arr[i][j];
        }
        System.out.println("The sum of the elements of the array is "+sum);
    }
}
