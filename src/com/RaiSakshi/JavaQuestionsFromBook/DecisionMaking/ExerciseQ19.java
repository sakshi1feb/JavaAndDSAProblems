package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ19 {
    // Pg 128 Q19
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A calculate program where you fill the choice from the below menu");
        System.out.println("1. + ---> Addition\n" +
                "2. - -----> Subtraction\n" +
                " 3. * -----> Multiplication\n" +
                "4. /---> Division");
        System.out.println("Enter your choice from the above menu ");
        char ch=sc.next().trim().charAt(0);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(ch){
            case '+':
                System.out.println("Addition of the two numbers is "+ (a+b));
                break;
            case '-':
                System.out.println("Difference between the two numbers is"+(a-b));
                break;
            case '*':
                System.out.println("Product of the two numbers is "+(a*b));
            case '/':
                System.out.println("The quotient when one number is divided by the other is "+(a/b));
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
