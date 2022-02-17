package com.RaiSakshi.LeetCodeProblems.Arrays.Easy;
    import java.util.*;
    public class RemoveElement {
        public static int[] removeElement(int[] nums, int val) {
            int[] newArray=new int[10];
            for(int i=0;i<newArray.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(val!=nums[j])
                        newArray[i]=nums[j];
                }
            }
            return newArray;

        }
        public static void main(String args){
            Scanner sc=new Scanner (System.in);
            int[]arr=new int[10];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();
            System.out.println("Enter the value to be removed from the array");
            int val=sc.nextInt();
            System.out.println("The new Array is "+ Arrays.toString(removeElement(arr, val)));
        }
    }
