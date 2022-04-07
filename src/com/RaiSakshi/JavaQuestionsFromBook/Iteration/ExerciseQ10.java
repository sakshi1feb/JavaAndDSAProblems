package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int d= prime(n);
        int r=0,nn=0;
        while(n>0){
            r=n%10;
            nn=nn*10+r;
            n=n/10;
        }
        int s=prime(nn);
        if(d==s)
            System.out.println("The Number is twisted prime");
        else
            System.out.println("The number is not twisted prime");
    }
    static int prime(int n){
        int count=0;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                count++;
            if(count==0)
                return 0;
            else
                return -1;
    }
}
