package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

/*
Write a program in Java to store the numbers in a 4 by 4 Matrix in a Double Dimension Array. Find the highest
and the lowest numbers of the Matrix by using an assignment statement.
 */
public class MaxAndMinOf2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int[][] arr= new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
                if(arr[i][j]<min)
                    min=arr[i][j];
            }
        }
        System.out.println("The maximum element of the array is "+max);
        System.out.println("The minimum element of the array is "+min);
    }
}
