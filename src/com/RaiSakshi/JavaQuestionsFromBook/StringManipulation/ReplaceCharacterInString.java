package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class ReplaceCharacterInString {
    /*
    Write a program to accept a String in lower case and replace 'e' with '*' in the given string. Display the
    new string.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='e')
                System.out.print("*");
            else
                System.out.print(str.charAt(i));
        }
    }
}
