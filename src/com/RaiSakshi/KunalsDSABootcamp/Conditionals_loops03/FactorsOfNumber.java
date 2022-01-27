package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03;

import java.util.Scanner;

public class FactorsOfNumber {
    // A program to print all the factors of the number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        System.out.print("The factors of the number are 1");
        for (int i = 2; i <=n ; i++) {
            if(n%i==0)
                System.out.print(", "+i);
        }
    }
}
