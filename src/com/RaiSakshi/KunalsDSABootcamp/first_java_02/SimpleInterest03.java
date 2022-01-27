package com.RaiSakshi.KunalsDSABootcamp.first_java_02;

import java.util.Scanner;

public class SimpleInterest03 {
    // This program is from Kunal's DSA Bootcamp
    // Where we calculate simple interest in taking principal, time and rate as input.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount ");
        int p=sc.nextInt();
        System.out.println("Enter time period ");
        int t=sc.nextInt();
        System.out.println("Enter rate of interest ");
        double r=sc.nextDouble();
        r=r/100;
        double si=1;
        si=p*r*t;
        System.out.println("Simple Interest is = "+si);
    }
}
