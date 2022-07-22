package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a program in java to store the numbers in a 4 by 4 Matrix in a Double Dimensional Array. Find the
 transposeof the Matrix by using an assignment statement. The transpose of a matrix is obtained when we change
 the row elements into column and column elements into rows.
 */
public class TransposeOf2DMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] matrix=new String[4][4];
        String[][] transpose=new String[4][4];
        //String [][] temp=new String[1][1];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
                matrix[i][j]=sc.next();
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("The original Matrix is ");
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("The Transpose of the Matrix is ");
        for(int i=0;i<transpose.length;i++)
            System.out.println(Arrays.toString(transpose[i]));
    }

}
