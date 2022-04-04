package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class SimultaneousPrimeNumber {
    // A program to display all the prime numbers between two numbers.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number ");
        int start=sc.nextInt();
        System.out.println("Enter the end limit ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            boolean value=prime(i);
            if(value==true)
                System.out.println(i);
        }
    }

     static boolean prime(int n) {
        int c=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                c++;
        }
        if(c==1)
            return true;
        else
            return false;

    }
}
