package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class PalindromeNumber {
    /*
    A program in java to enter a number and check whether the number is aPalindrome or not.
    A number is said to be a Palindrome if the new number obtained after reversing the digits is same as
    the original number.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=1,nn=0,m=n;
        while (n>0){
            r=n%10;
            nn=nn*10+r;
            n=n/10;
        }
        if(nn==m)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
