package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ16 {
    // series question
    public static void main(String [] args){
        seriesA();
        seriesB();
        seriesC();
    }

    static void seriesC() {
        Scanner sc=new Scanner(System.in);
        
    }

    static void seriesB(){
         Scanner sc=new Scanner(System.in);
         System.out.println("\nEnter number of terms in the sequence for sequence 2");
         int n=sc.nextInt();
         int a=1;
         int b=1;
         int c;
         System.out.print(a+" + "+b);
         for(int i=1;i<=n;i++){
             c=a+b;
             System.out.print(" + "+c);
             a=b;
             b=c;
         }
    }

     static void seriesA() {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n that lies between 1 and 9");
        int n=sc.nextInt();
        for(int i=9;i>n;i--){
            System.out.print(i);
            int r=i*10 + 9;
            System.out.print(" + "+r+" + ");
        }
        System.out.print(n);
    }
}
