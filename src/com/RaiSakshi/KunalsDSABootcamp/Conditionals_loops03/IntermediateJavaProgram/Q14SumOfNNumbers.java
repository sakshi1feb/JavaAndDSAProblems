package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q14SumOfNNumbers {
    // A program to display the sum of n numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms :");
        int N=sc.nextInt();
        int sum =0;
        System.out.println("Enter a number ");
        for(int i=1;i<=N;i++){
            int m=sc.nextInt();
            sum =sum +m;
        }
        System.out.println("The sum of the numbers is "+sum);
    }
}
