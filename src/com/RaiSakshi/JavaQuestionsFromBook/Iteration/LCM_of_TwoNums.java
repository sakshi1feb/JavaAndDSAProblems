package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class LCM_of_TwoNums {
    // A program to find LCM of two numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(lcm(a,b));
    }
   static String  lcm(int a, int b){
        int l=1;
        l=(a>b)?a:b;
        if(l%Math.min(a,b)!=0)
            l=a*b;
        return ("The LCM of the two numbers is "+l);
    }
}
