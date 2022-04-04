package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1. Display the factors of the number\n2.Display the factorial of a number");
        System.out.println("Enter your choice from the above menu ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1 -> {
                System.out.println("Enter a number to find factors ");
                int n = sc.nextInt();
                System.out.println("The factors of the number are: ");
                for (int i = 1; i <= n / 2; i++)
                    if (n % i == 0)
                        System.out.println(i);
            }
            case 2 -> {
                System.out.println("Enter a number to find factorial ");
                int m = sc.nextInt();
                int fact = 1;
                for (int i = m; i >= 1; i--)
                    fact = fact * i;
                System.out.println("The factorial of the number is " + fact);
            }
            default -> System.out.println("Invalid choice");
        }
    }
}
