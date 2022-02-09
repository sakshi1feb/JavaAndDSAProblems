package com.RaiSakshi.KunalsDSABootcamp.Functions04;
import java.util.Scanner;

public class Q1MaximumAndMinimum {
    // A program to define two methods to print the maximum and the minimum number respectively among three
    // numbers entered by the user.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The maximum of the three numbers is "+maximum(a,b,c));
        System.out.println("The minimum of the three numbers is "+minimum(a,b,c));
    }

     static int  minimum(int a, int b, int c) {
        return Math.min(a,Math.min(b,c));
    }

    static int  maximum(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }
}
