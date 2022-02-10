package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q7PrimeNumber {
    // A program to check if a number is prime or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("The number is "+prime(n));
    }

     static String prime(int n) {
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return " not prime";
        }
        return "prime";

    }
}
