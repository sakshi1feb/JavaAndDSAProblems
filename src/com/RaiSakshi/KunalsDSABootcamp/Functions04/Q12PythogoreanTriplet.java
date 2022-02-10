package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q12PythogoreanTriplet {
    // A program to input three numbers and check if they form a pythogorean Triplet or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The numbers "+pythogoreanTriplet(a,b,c));
    }
    static String pythogoreanTriplet(float a, float b, float c){
        if((Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))||(Math.pow(a,2)+ Math.pow(c,2)==Math.pow(b,2))||Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2))
            return "form pythogorean triplet";
        else
            return "do not form pythogorean triplet";
    }
}
