package com.RaiSakshi.KunalsDSABootcamp.Arrays;
import java .util.Scanner;
 public class Q16ArrayWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int r=0,c=0;
            while(n>0){
                r=n%10;
                c++;
                n=n/10;
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=sc.nextInt();
        int[] nums= new int[l];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<nums.length;i++)
            nums[i]=sc.nextInt();
            System.out.println("The number or array elements with even number of digits are:"+findNumbers(nums));
        }
    }

