package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1.Pattern 1 Triangle\n 2. Pattern 2 Inverted Triangle");
        System.out.println("Enter your choice from the above menu ");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter the number of terms");
                int n=sc.nextInt();
                for(int i=1;i<=n;i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print(i + " ");
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Enter number of terms");
                int m=sc.nextInt();
                for(int i=m;i>=1;i--) {
                    for (int j = 1; j <= i; j++)
                        System.out.print(i + " ");
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
