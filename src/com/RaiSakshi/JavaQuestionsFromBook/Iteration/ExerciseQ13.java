package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                c++;
        }
        if(c>1){
            int m=n+20;
            for(int i=n+1;i<=m;i++){
                int count=0;
                for(int j=1;j<=i/2;j++)
                    if(i%j==0)
                        count++;

                if(count==1){
                    System.out.println("The next prime number is "+i);
                    break;
                }
            }
        }
        else
            System.out.println("The number is prime");
    }
}
