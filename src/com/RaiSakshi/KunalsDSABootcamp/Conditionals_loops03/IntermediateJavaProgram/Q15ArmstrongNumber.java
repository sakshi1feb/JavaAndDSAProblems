package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q15ArmstrongNumber {
    /*
    A program to check whether a number is Armstrong or not
    A number is said to be armstrong if the sum of the cube of the digits of the number is equal to the
    number itself
                407=4*4*4 +0*0*0 + 7*7*7 = 407
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number ");
        int n=sc.nextInt();
        int m=n;
        int r,s=0,c=1;
        while (n>0){
            r=n%10;
            c=r*r*r;
            s+=c;
            n=n/10;
        }
        if(s==m)
            System.out.println("The above input number is an armstrong number");
        else
            System.out.println("The above input number is not an armstrong number");
    }
}
