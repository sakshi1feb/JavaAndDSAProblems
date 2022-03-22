package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int s;
        for(int i=1;i<=n;i++){
            s=n-i;
            for (int sp=1;sp<=i;sp++)
                System.out.print(" ");
            for(int j=1;j<=n-i+1;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
