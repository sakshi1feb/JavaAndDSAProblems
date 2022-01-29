package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q1FactorialProgram {
    // A program to calculate the factorial of a number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int fact=1;
        for (int i = n; i >=1 ; i--) {
            fact*=i;
        }
        System.out.println("The factorial of the number is "+fact);
    }
}
