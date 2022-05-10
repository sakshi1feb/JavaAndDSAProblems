package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class patternb {
    //Pg 203 of book Prog 4(b)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.next();
        for (int i = str.length(); i>=0 ; i--) {
            for(int space=0;space<=(str.length()-i-1);space++)
                System.out.print(" ");
            System.out.println(str.substring(0,i));
            
        }
    }
}
