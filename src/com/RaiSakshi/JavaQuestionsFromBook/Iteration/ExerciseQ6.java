package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=0,d=0,nn=0,rev=0;
        while(n>0){
            r=n%10;
            if(r!=0)
                nn=nn*10+r;
            n=n/10;
        }
        // System.out.println(nn);
        while(nn>0){
            d=nn%10;
            rev=rev*10+d;
            nn=nn/10;
        }
        System.out.println("The new noubmer after removing all the zeros is "+rev);
    }
}
