package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is in Fibonacci series or not.");
        int n = sc.nextInt();
        int a=0,b=1,c=0,k=0;
        for(int i=1;i<=n;i++){
            c=a+b;
            if(c==n)
                k++;
            a=b;
            b=c;
        }
        if(k>=1)
            System.out.println("The number is present in the fibonacci series ");
        else
            System.out.println("The number is not present in the fibonacci series ");
    }
}