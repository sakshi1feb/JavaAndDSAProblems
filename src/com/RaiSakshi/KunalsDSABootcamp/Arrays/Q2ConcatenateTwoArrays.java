package com.RaiSakshi.KunalsDSABootcamp.Arrays;

         import java.util.Arrays;
        import java.util.Scanner;

    public class Q2ConcatenateTwoArrays { ;
    public static int[] getConcatenation(int[] nums) {
        int l=nums.length *2;
        int[] ans=new int [l];
        int i=0;
        for(int k=1;k<=2;k++){
            for(int j=0;j<nums.length;j++){
                ans[i]=nums[j];
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of an array");
        int l =sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
            arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}


