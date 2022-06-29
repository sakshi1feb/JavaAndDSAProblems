package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the index you want to swap");
        int index1 = sc.nextInt();
        System.out.println("Enter the index with which you want to swap");
        int index2 = sc.nextInt();
        System.out.println("The new Swapped array is" + Arrays.toString(swap(arr, index1, index2)));
    }

    static int[] swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }
        //A program to swap elements of an array practice


      /*  int[] arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index4 ){
        int temp;
        temp= arr[index1];
        arr[index1]=arr[index4];
        arr[index4]=temp;

    }
*/
    }
