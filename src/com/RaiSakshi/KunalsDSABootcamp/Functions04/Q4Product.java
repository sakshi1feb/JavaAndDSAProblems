package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q4Product {
    // A program to return product of two numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The product of two numbers is "+product(a,b));
    }

     static int product(int a, int b) {
        return a*b;
    }
}
