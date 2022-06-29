package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class build2darray {
    /*
    a simple program to create an 2d array
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr =new int[3][2];
        for(int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++)
//                System.out.print(arr[i][j]+" ");
//            System.out.println();
//        }
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
