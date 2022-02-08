package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q7Power {
    // A program to calculate power(work done/time) in java
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter work done in Joule");
        double w=sc.nextDouble();
        System.out.println("Enter time in second");
        int t=sc.nextInt();
        double power=w/t;
        System.out.println("Power in Watt is "+power);
    }
}
