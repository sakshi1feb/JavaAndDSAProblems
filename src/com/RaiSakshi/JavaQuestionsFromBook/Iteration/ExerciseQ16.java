package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class ExerciseQ16 {
    // series question
    public static void main(String [] args){
       seriesA();
       seriesB();
       seriesC();
       series4();
       seriesE();
       seriesF();
       seriesG();
       seriesH();
       seriesI();
       seriesJ();
    }

    static void seriesJ() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter value of n");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            System.out.print("("+1);
            for(int j=2;j<=i;j++){
                System.out.print("+"+j);
            }
            System.out.print(")/("+1);
            for(int k=2;k<=i;k++)
                System.out.print("*"+k);
            System.out.print(") + ");
        }
    }

    static void seriesI() {
         Scanner sc=new Scanner(System.in);
         System.out.println("\nEnter number of terms in the series");
         int n=sc.nextInt();
         int j=1;
         System.out.print(j);
         for(int i=2;i<=n;i++){
             System.out.print(" + "+(j+2)+"/"+(i*i));
             j+=2;
         }
    }

    static void seriesH() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter number of terms in the series 8");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+"/"+(i+1));
            System.out.print(" + ");
        }
    }
    static void seriesG() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter number of terms for series 7 ");
        int n=sc.nextInt();
        System.out.print(1 );
        for(int i=2;i<=n;i++){
            int fact=1;
            for(int j=i;j>=1;j--)
                fact=fact*j;
            System.out.print(" + "+fact);
        }
    }

    static void seriesF() {
        System.out.print("\n");
        for(int i =1;i<=9;i++){
            System.out.print(i);
            System.out.print(" + (1");
            for(int j=2;j<=i+1;j++){
                System.out.print("*"+j);
            }
            System.out.print(") + ");
        }
    }

    static void seriesE() {
        for(int i=1;i<=10;i++){
            System.out.print("(1");
            for(int j=2;j<=i;j++)
                System.out.print("+"+j);
            System.out.print(") + ");
        }
    }

    static void series4() {
        System.out.println();
        for(int i=1;i<=19;i++){
            System.out.print("("+i+"*"+(i+1)+") + ");
        }
    }

    static void seriesC() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter value of n for series 3");
        int n=sc.nextInt();
        int j=2;
        for(int i=1;i<=n/2;i++){
            if(i%2!=0)
                System.out.print(j);
            else
                System.out.print(" - "+j +" + ");
            j+=2;
        }
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
