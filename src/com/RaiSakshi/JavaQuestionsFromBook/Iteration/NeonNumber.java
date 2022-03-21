package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class NeonNumber {
    /*
    A program to enter a number and check if the number is 'Neon' or not. A number is said to be neon if sum
    of the digits of the square of the number is equal to the number itself.
    Sample Input: 9
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sq=n*n;
        int r=1,sum=0;
        while (sq>0){
            r=sq%10;
            sum+=r;
            sq=sq/10;
        }
        if(sum==n)
            System.out.println("Neon Number ");
        else
            System.out.println("Not a Neon Number");
    }
}
