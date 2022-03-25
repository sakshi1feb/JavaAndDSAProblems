package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("The factors are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.println(i);
        }
    }

}
