package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class Patterna {
    // Pg 202 Prog 4
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.next();
        for(int i=0;i<=str.length();i++)
            System.out.println(str.substring(0,i));
    }
}
