package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=a*b;
        int cp=1;
        for(int i=1;i<=p;i++){
            if(a%i==0 && b%i==0)
                cp=i;
        }
        if(cp==1)
            System.out.println("The numbers are co-prime");
        else
            System.out.println("The numbers are not co-prime");
    }
}
