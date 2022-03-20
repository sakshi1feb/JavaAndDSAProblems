package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows in the pattern ");
        int n=sc.nextInt();
        pattern(n);
    }

    static void pattern(int n) {
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
