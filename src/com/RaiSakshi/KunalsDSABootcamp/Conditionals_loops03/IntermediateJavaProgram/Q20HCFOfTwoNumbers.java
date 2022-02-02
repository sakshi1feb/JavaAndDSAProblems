package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q20HCFOfTwoNumbers {
    // A program to calculate  HCF of two numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=a*b;
        int hcf=1;
        for (int i = 1; i <=p ; i++) {
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        System.out.println("HCF of the two numbers is "+hcf);
    }
}
