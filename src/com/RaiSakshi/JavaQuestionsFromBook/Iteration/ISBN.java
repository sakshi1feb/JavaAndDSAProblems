package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ISBN {
    // Pg 156 Prog 19
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int m=n;
        int r=0,d=0;
        int c=0,sum=0;
        while(n>0){
            r=n%10;
            c++;
            n=n/10;
        }
        if(c==10){
            while(m>0){
                d=m%10;
                sum+=d*c;
                c--;
                m=m/10;
            }
            if(sum%11==0)
                System.out.println("It is an ISBN Code");
            else
                System.out.println("Not an ISBN Code");
        }else
            System.out.println("Not an ISBN Code");
    }
}
