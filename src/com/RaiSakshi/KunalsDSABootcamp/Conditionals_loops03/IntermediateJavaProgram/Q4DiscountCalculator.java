package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q4DiscountCalculator {
    // A program to calculate discount on product
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product price");
        int pp=sc.nextInt();
        System.out.println("Enter discount percent");
        double dis=sc.nextDouble();
        double dp= pp*dis/100;
        System.out.println("The discount on the product is of "+dp);
    }

}
