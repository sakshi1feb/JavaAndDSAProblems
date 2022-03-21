package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class Automorphic {
    /*
    An Automorphic number is the number which is contained in the last digit(s) of its square. Write a
    program to input a number and check whether the number is an 'Automorphic' or not.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int m=n;
        int sq=m*m;
        int d=1, c=0;
        while(m>0){
            d=m%10;
            c++;
            m=m/10;
        }
        double r=Math.pow(10,c);
        if(sq%(int)r==n){
            System.out.println("The number is Automorphic");
        }else
            System.out.println("The number is not Automorphic");

    }
}
