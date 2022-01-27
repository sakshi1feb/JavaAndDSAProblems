package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q21FibonacciSeries {
    // A program to a particular term in Fibonacci Series
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;int b=1,temp;
        System.out.println("Enter the term whose value you would like to know from Fibonacci Series ");
        int n=sc.nextInt();
        for(int i=3;i<=n;i++){
            temp=b;
            b+=a;
            a=temp;
        }
        System.out.println("The value of the "+n+" term is "+b);
    }
}
