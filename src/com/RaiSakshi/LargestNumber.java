package com.RaiSakshi;

import java.util.Scanner;

public class LargestNumber {
    // This program is from Kunal's DSA Bootcamp
    // In this program we have to take two numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("The largest of the two numbers is "+ (Math.max(a,b)));

    }
}
