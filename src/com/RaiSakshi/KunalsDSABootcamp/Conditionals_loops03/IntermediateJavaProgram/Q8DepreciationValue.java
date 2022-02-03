package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q8DepreciationValue {
    // A program to calculate the depreciation value of a product
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the actual value");
        int act=sc.nextInt();
        System.out.println("Enter rate of depreciation");
        double r=sc.nextDouble();
        System.out.println("Enter number of years ");
        int n=sc.nextInt();
        double depvalue= act -(act*n*r/100);
        System.out.println("The depreciated value is "+depvalue);
    }
}
