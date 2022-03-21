package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class MinAndMaxNumber {
    /*
    A program to accept 10 different numbers. Display the greatest and the smallest numbers from this set
    of numbers.Display the greatest and the smallest number from this set of numbers entered by the user.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int a=sc.nextInt();
        int max=a;
        int min=a;
        for(int i=1;i<10;i++){
            int b=sc.nextInt();
            max=Math.max(a,b);
            min=Math.min(a,b);
        }
        System.out.println("The Maximum of 10 numbers is "+max);
        System.out.println("The minimum of 10 numbers is "+min);
    }
}
