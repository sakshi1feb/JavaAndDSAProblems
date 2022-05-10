package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class ConversionOfLetters {
    /*
    Write a program to enter a letter. Display the new letter and it's ASCII code after changing the case.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter ");
        char ch=sc.next().trim().charAt(0);
        char newch ;
        if(Character.isLetter(ch)){
            if(Character.isLowerCase(ch))
                newch=Character.toUpperCase(ch);
            else
                newch=Character.toLowerCase(ch);
            System.out.println("The new converted character is "+newch);
            System.out.println("The ASCII code for the new character is "+(int)newch);
        }else
            System.out.println("The input character is not a letter");
    }
}
