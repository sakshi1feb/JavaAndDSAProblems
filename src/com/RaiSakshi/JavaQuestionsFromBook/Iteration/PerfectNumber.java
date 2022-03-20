package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class PerfectNumber {
    // A number is said to be perfect if the sum of factors(including 1 and excluding the number) is same
    // as the original number.(Example 6)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println(perfect(n));
    }

    static String perfect(int n) {
       int  sum=0;
        for(int i=1;i<=n/2;i++)
           sum+=i;
        if(sum==n)
            return "Perfect Number";
        else
            return "Not a Perfect Number";
    }
}
