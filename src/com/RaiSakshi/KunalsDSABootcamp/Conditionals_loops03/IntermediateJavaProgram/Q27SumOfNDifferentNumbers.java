package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q27SumOfNDifferentNumbers {
    /*
        a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd
        numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sn=0,se=0,so=0;
        System.out.println("Enter numbers");
        int n=sc.nextInt();
        while (n!=0){
             if(n<1){
                sn+=n;
            }else if(n>=1){
                if(n%2==0){
                    se+=n;
                }else{
                    so+=n;
                }
            }
            int m=sc.nextInt();
            n=m;
        }
        System.out.println("Sum of negative numbers is "+sn);
        System.out.println("Sum of even positive number is "+se);
        System.out.println("Sum of odd positive number is "+so);
    }
}
