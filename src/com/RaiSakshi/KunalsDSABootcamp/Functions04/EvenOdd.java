package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class EvenOdd {
    // A function to find if a number is even or odd.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("The number is "+evenOdd(n));
    }

    static String evenOdd(int n) {
        if(n%2==0)
            return "even";
        else
            return "odd";
    }
}
