package com.RaiSakshi.KunalsDSABootcamp.Patterns_09;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
    for(int i=1;i<= n;i++){
       for(int j=1;j<=n-i+1;j++)
           System.out.print("*");
        System.out.println();
    }
}}
