package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class ExtractWordFromString {
    /*
    Write a program to accept a name and display the new string after reversing each character of the word.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        str=str.trim();
        int j=str.indexOf(' ');
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==' ')
                System.out.println();
            else
                System.out.print(str.charAt(i));
        }
    }
}
