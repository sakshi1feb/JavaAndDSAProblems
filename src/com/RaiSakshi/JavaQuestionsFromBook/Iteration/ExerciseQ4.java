package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=0,sum=0;
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println("Sum of the digits of the number is "+sum);
    }

}
