package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

import static java.lang.System.in;

public class ExerciseQ1 {
    public static void main(String[] args) {
        pattern1(10);
        pattern2(10);
        pattern3(10);
        pattern4(10);
        //pattern5(10);
    }
    static void pattern1(int n) {
        int v = 1;
        System.out.print(v);
        for (int i = 2; i <= n; i++) {
            v = v + 2;
            if (i % 2 != 0)
                System.out.print(", " + v);
            else
                System.out.print(", -" + v);
        }
        System.out.println();
    }
        static void pattern2(int n){
            int a = 2;
            int inc = 3;
            System.out.print(a);
            for (int i = 2; i <= n; i++) {
                a=a+inc;
                System.out.print(", "+a);
                inc+=2;
            }
            System.out.println();
        }
        static void pattern3(int n){
        int a=0,b=1,c=2,d=0;
            System.out.print(a+", "+b+", "+c);
            for(int i=4;i<=n;i++){
                d=a+b+c;
                System.out.print(", "+d);
                a=b;
                b=c;
                c=d;
            }
            System.out.println();
        }
        static void pattern4(int n){
         int a=0,inc=3;
            System.out.print(a);
         for(int i=2;i<=n;i++){
             a+=inc;
             System.out.print(", "+a);
             inc+=2;
         }
            System.out.println();
        }
}
