package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q10CalculateCGPA {
    // A program to calculate CGPA
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects ");
        int n=sc.nextInt();
        System.out.println("Enter the sum of grades obtained in "+n+" subjects");
        int sum=sc.nextInt();
        float cgpa =sum/n;
        System.out.println("The CGPA is "+cgpa);
    }
}
