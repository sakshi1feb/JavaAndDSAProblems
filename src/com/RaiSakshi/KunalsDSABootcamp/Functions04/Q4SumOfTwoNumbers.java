package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q4SumOfTwoNumbers {
    // A program to return the sum of two numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of two numbers is "+add(a,b));
    }

    static int add(int a, int b) {
        return a+b;
    }
}
