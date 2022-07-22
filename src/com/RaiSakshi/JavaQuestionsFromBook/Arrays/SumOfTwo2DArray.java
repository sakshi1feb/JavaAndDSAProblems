package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a program in java to store the numbers in two different 4 by 4 matrices in a Double Dimensional Array.
Find the sum of the numbers of the corresponding elements of the two Matrices and store them in another 4 by 4
matrix and display the sum matrix.
 */
public class SumOfTwo2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr1=new int[4][4];
        int[][] arr2=new int[4][4];
        int[][] sum=new int[4][4];
        System.out.println("Enter elements of the Array 1");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++)
                arr1[i][j]=sc.nextInt();
        }
        System.out.println("Enter elements of the Array 2");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++)
                arr2[i][j]=sc.nextInt();
        }
        System.out.println("Array containing the sum is ");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                sum[i][j]=(arr1[i][j]) + (arr2[i][j]);
            }
        }
        for(int i=0;i<sum.length;i++){
            System.out.println(Arrays.toString(sum[i]));
        }
    }
}
