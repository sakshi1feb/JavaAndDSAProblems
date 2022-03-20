package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class PrimeNumber {
    // Input a number and check if it is prime or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println(prime(n));
    }

     static String prime(int n) {
        if(n==1 || n==0)
            return("Neither prime not composite");
        if(n<0)
            return("It is a negative number");
        if(n>=2)
            for(int i=2;i*i<=n;i++){
                if(n%i==0)
                  return ("Not a prime number ");

            }
            return("Prime number ");

    }
}
