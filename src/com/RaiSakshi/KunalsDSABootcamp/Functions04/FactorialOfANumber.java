package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class FactorialOfANumber {
    // A program to find factorial of a number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("The factorial of the number is "+Factorial(n));
    }

    static int Factorial(int n) {
        int fact=1;
        for(int i=n;i>=1;i--) {
             fact = fact * i;
        }
        return fact;
    }

}
