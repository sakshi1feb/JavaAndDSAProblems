package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ArmstrongNumber {
    /*
    A program in java to enter a number and check whether the number is an Armstrong number or not.
    A number is said to be Armstrong if the sum of the cubes of it's digit is equal to the original number.
    Example: 153
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int m=armstrong(n);
        if(m==n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
    static int armstrong(int n){
        int r=1,sum=0;
        while(n>0){
            r=n%10;
            sum +=r*r*r;
            n=n/10;
        }
        return sum;
    }
}
