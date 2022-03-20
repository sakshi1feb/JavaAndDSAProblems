package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pat(5);
    }
    static void pat(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
