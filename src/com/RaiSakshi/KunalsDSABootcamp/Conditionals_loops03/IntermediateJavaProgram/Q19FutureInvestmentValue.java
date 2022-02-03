package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q19FutureInvestmentValue {
    // A program to calculate Future Investment Value
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount ");
        int p=sc.nextInt();
        System.out.println("Enter Rate of Interest ");
        double r=sc.nextDouble();
        System.out.println("Enter number of years of investment");
        int n=sc.nextInt();
        double fiv=p+(p*n*r/100);
        System.out.println("The future investment value is "+fiv);
    }
}
