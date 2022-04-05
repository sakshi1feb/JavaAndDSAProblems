package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ31 {
    //Page 171 Q31
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1. BUZZ Number\n2. GCD of two numbers");
        System.out.println("Enter your choice from the above menu");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter a number");
                int n=sc.nextInt();
                if(n%7==0 || n%10==7)
                    System.out.println("The number is a Buzz  number ");
                else
                    System.out.println("Not a Buzz number ");
                break;
            case 2:
                System.out.println("Enter two numbers ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int p=a*b;int hcf=1;
                for(int i=1;i<=p;i++){
                    if (a%i == 0 && b%i==0) {
                        hcf=i;
                    }
                }
                System.out.println("The Greatest Common Factor of the two number is "+hcf);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
