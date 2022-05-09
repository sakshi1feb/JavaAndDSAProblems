package com.RaiSakshi.KunalsDSABootcamp.Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not ");
        String string=sc.next();
        boolean result =palindrome(string);
        if(result==true)
            System.out.println("The input string is palindrome");
        else
            System.out.println("The input string is not palindrome");

    }

    static boolean palindrome(String string) {
        for(int i =0;i<=string.length()/2;i++){
            char start =string.charAt(i);
            char end= string.charAt(string.length()-1-i);
            if(start !=end)
                return false;
        }
        return true;
    }
}
