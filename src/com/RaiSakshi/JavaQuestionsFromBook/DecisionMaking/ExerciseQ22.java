package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ22 {
    // Pg 128 Q21
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1. To calculate natural logarithm of the number"+
                "\n2. Absolute value of the number\n3. Square root of the number\n4. Random number between 0&1");
        System.out.println("Enter your choice from the above menu ");
        int ch=sc.nextInt();
        float n;
        switch (ch){
            case 1:
                System.out.println("Enter a number to find it's natural logarithm ");
                n=sc.nextFloat();
                System.out.println("The natural logarithm is "+Math.log(n));
                break;
            case 2:
                System.out.println("Enter a number to find it's absolute value ");
                 n=sc.nextFloat();
                System.out.println("The absolute value of the number is "+(Math.abs(n)));
                break;
            case 3:
                System.out.println("Enter a number to find square root ");
                n=sc.nextFloat();
                System.out.println("The square root of the number is "+Math.sqrt(n));
                break;
            case 4:
                System.out.println("A random number between 0 & 1 is "+(1*Math.random()));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
