package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q10PalindromeNumber {
    // A program to check if a number is palindrome or not.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number");
        int n=sc.nextInt();
        int rev=palindrome(n);
        if(rev==n){
            System.out.println("The number is palindrome");
        }else
            System.out.println("The number is not palindrome");
    }

    static int palindrome(int n ){
        int nn=0,r=0;
        while(n>0){
            r=n%10;
            nn=nn*10+r;
            n=n/10;
        }
        return nn;
    }
}
