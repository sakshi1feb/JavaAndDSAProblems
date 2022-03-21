package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class SumOfChoice {
    /*
    You want to calculate the sum of all positive even numbers and the sum of all negative odd numbers
    from a set of numbers. You can enter 0 (zero) to quit the program and thus it displays the result.
    Write a program to perform the above task.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number Enter 0 to quit");
        int n=sc.nextInt();
        int se=0 , so=0;
        while(n!=0){
                if(n>0 && n%2==0)
                    se+=n;
                else if(n<0 && n%2!=0)
                        so+=n;
                else if(n==0)
                    break;
            n=sc.nextInt();
            }
        System.out.println("The sum of positive even number is "+se);
        System.out.println("The sum of negative odd  number is "+so);
    }
}
