package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ33 {
    // Pg 172 Q33
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1. 1, 3, 8, ..... n terms\n 2. 1/2 + 3/4 +5/6+ ... 19/20");
        System.out.println("Enter your choice from the above menu ");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter number of terms ");
                int n=sc.nextInt();
                int a=3,val=0;
                System.out.print(val);
                for(int i=0;i<n;i++){
                    val+=a;
                    System.out.print(", "+val);
                    a+=2;
                }
                break;
            case 2:
                for(int i=1;i<=20;i++){
                    System.out.print(i+"/");
                    i++;
                    System.out.print(i+" + ");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
