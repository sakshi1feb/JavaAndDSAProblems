package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class Series {
    //Pg 150
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        double s=0;
        for(int i=2;i<=n;i++){
            s+=(a/i);
            System.out.print(a+" /"+i+" + ");
        }
        System.out.println("\nSum of the series is "+s);
    }
}
