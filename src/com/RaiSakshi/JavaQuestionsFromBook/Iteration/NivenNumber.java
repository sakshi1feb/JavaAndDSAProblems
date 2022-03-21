package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class NivenNumber {
    /*
    A program to input a number.Check and display whether it is a niven number or not.
    A number is said to be Niven if it is divisible by the sum of it's digits
    Example: 126
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int sd=niven(n);
        if(n%sd==0)
            System.out.println("It is a Niven Number ");
        else
            System.out.println("It is not a Niven Number ");
    }
    static int niven(int n){
        int s=0,r=1;
        while(n>0){
            r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
}
