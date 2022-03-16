package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("The factoria of the number is "+ fact(n));
    }

     static int  fact(int n) {
        int f=1;
         for (int i = n; i >=1; i--) {
             f=f*i;

         }
         return f;
    }
}
