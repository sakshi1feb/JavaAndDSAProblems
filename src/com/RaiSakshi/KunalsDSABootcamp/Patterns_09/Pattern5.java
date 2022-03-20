package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int i=1;i<2*n;i++){
            if(i>n){
                int d=i-n;
               for(int j=1;j<=(n-d);j++)
                   System.out.print("* ");
            }else{
                for(int j=1;j<=i;j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
