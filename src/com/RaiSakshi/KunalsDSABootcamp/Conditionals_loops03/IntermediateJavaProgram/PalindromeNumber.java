package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int r=0,nn=0;
        int m=n;
        while (n>0){
            r=n%10;
            nn=nn*10+r;
            n=n/10;
        }
        if(nn==m)
            System.out.println("The number is a palindrome number");
        else
            System.out.println("The number is not a palindrome number");
    }
}
