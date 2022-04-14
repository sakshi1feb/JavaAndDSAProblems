package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=Math.abs(a-b);
        if(d==2){
           int ka= prime(a);
           int kb=prime(b);
           if(ka==0 && kb==0)
               System.out.println("Twin prime number ");
           else
               System.out.println("Not a twin prime number ");
        }else
            System.out.println("Not a twin prime number ");
    }
    static int prime(int n){
        int count=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
                count++;

            if(count==1)
                return 0;
            else
                return 1;
    }
}