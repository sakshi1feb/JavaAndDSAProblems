package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=0,count=0;
        while(n>0){
            r=n%10;
            if(r==0){
                count++;
                break;
            }
            n=n/10;
        }
        if(count>0)
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}
