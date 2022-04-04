package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1.Fibonacci Series up to n terms \n2. Sum of the digits of a number ");
        System.out.println("Enter your choice ");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter the number of terms in the fibonacci series ");
                int n=sc.nextInt();
                int a=0,b=1,c=0;
                System.out.print(a+", "+b);
                for(int i=3;i<=n;i++){
                    c=a+b;
                    System.out.print(", "+c);
                    a=b;
                    b=c;
                }
                break;
            case 2:
                System.out.println("Enter a number to find the sum of the digits ");
                int m=sc.nextInt();
                int d=0,sum=0;
                while (m>0){
                    d=m%10;
                    sum+=d;
                    m=m/10;
                }
                System.out.println("The sum of the digits of the number is "+sum);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
