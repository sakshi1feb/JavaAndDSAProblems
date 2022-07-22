package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

/*
Write a program in java to store the numbers in a 4 by 4 Matrix in a Double Dimensional Array. Find the sum
of the numbers of each row and the sum of the numbers of each column fo the Matrix by using an assignment
statement.
 */
public class SumOfRowsAndColumnsIn2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][4];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.println("The sum of elements of each row and column is  :\n");
        for(int i=0;i<arr.length;i++){
            int sumr=0,sumc=0;
            for(int j=0;j<arr[i].length;j++) {
                sumr += arr[i][j];
                sumc += arr[j][i];
            }
            System.out.println("\tThe sum of "+(i+1)+" row = "+sumr);
            System.out.println("\tThe sum of "+(i+1)+" column = "+sumc);
        }
    }
}
