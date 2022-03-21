package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class FactorialSeries {
    // Pg 161
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        double s=1;
        System.out.print("1");
        for(int i=1;i<n;i++){
            int fact=1;
            double num=Math.pow(a,i+1);
            for(int j=i;j>=1;j--)
                fact*=j;
            s+=num/fact;
           System.out.print(" +  "+(int)num+" / "+fact);
        }
        System.out.println("\nSum of the series is "+s);
    }
}
