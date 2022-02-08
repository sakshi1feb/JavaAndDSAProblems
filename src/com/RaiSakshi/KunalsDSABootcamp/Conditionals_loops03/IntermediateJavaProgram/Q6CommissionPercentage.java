package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q6CommissionPercentage {
    // A program to calculate commission percentage
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter commission obtained ");
        int c=sc.nextInt();
        System.out.println("Enter total amount ");
        int a=sc.nextInt();
        double cpercent=c*100/a;
        System.out.println("Commission percentage is "+cpercent);
    }

}
