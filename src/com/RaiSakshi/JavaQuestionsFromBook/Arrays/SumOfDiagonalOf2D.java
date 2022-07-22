package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

/*
Write a program in java to store the numbers in a 4 by 4 Matrix in a Double Dimensional Array. Find
 the sum of the numbers of the left diagonal and the right diagonal of the Matrix.
 */
public class SumOfDiagonalOf2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][4];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=sc.nextInt();
        }
        int sumLeftDiagonal=0,sumRightDiagonal=0;
        for(int i=0;i<arr.length;i++){
            sumLeftDiagonal+=arr[i][i];
            sumRightDiagonal+=arr[i][arr.length-i-1];
        }
        System.out.println("Sum of the left diagonal of the array is "+sumLeftDiagonal);
        System.out.println("Sum of the right diagonal of the array is "+sumRightDiagonal);
    }
}

