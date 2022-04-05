package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ32 {
    // Page 171 Question 32
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1. To check a number is prime or not\n2.To check a number is Automorphic");
        System.out.println("Enter your choice from the above menu");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter a number to check if it is prime or not ");
                int n=sc.nextInt();
                char c=0;
                for(int i=2;i<=n/2;i++){
                    if(n%i==0)
                        c++;
                }
                if(c==0)
                    System.out.println("Prime Number");
                else
                    System.out.println("Not a prime number");
                break;
            case 2:
                System.out.println("enter a number to check if it is automorphic or not  ");
                int m=sc.nextInt();
                int sq=m*m;
                int mm=m;
                int r=0,count=0;
                while(m>0){
                    r=m%10;
                    count++;
                    m=m/10;
                }
                if(sq%Math.pow(10,count)==mm)
                    System.out.println("Automorphic number ");
                else
                    System.out.println("Not an automorphic number");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
