package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q23PerfectNumber {
    /*
        A program to check whether a number is perfect or not
        A number is said to be perfect if the sum of the factors of the number excluding the number is
        equal to the number.
         6=1+2+3
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n/2; i++) {
            sum=sum+i;
        }
        if(sum==n){
            System.out.println(n+" is a perfect number");
        }else{
            System.out.println(n+" is not a perfect number");
        }
    }
}
