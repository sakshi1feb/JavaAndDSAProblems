package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIn2DArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int l=sc.nextInt();
        int [][] arr=new int[l][l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++)
                arr[i][j]=sc.nextInt();
        }
        int max= maxInArr(arr);
        System.out.println("The Maximum number in the input array is "+max);
    }
    static int maxInArr(int [][] arr){
       int max=arr[0][0];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++)
                if (arr[i][j] >= max)
                    max = arr[i][j];
        }
        return max;
        }
}
