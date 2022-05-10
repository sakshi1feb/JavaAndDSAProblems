package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class CharacterExtractionFromString {
    /*
    Write a program to display the given pattern: BLUEJ
    B
    L
    U
    E
    J
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String string=sc.next();
        for(int i=0;i<=string.length()-1;i++)
            System.out.println(string.charAt(i));
    }
}
