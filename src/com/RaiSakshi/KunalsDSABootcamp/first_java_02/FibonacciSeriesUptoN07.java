package com.RaiSakshi.KunalsDSABootcamp.first_java_02;

import java.util.Scanner;

// This program prints fibonacci series upto n numbers.
public class FibonacciSeriesUptoN07 {
    //This program is from Kunal's DSA Bootcamp questions
    // In this program we have to display the fibonnicci series upto n.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0 , b=1, temp;
        System.out.print("Enter the number of terms in the fibonacci series ");
        int n=sc.nextInt();
        System.out.print("The terms of Fibonacci Series are :\n\t\t "+ a+ ", "+b);
        for (int i = 3; i <=n ; i++) {
            temp=b;
            b=b+a;
            a=temp;
            System.out.print(" "+ b);

        }
    }
}
