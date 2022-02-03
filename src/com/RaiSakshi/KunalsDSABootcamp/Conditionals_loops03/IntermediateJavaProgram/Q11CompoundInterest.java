package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q11CompoundInterest {

    // A program to calculate compound Interest
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal");
        double p=sc.nextDouble();
        System.out.println("Enter rate of interest ");
        double r=sc.nextDouble();
        r=r/100;
        System.out.println("Enter time period  ");
        double t=sc.nextInt();
        double A=p*Math.pow((1+r),t);
        System.out.println(A);
        double ci= A-p;
        System.out.println("Compound Interest is "+ci);
    }
 }

