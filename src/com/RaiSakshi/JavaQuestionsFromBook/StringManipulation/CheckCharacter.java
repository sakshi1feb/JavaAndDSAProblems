package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class CheckCharacter {
    /*
    Write a program to accept a character and check the case(upper/lower) otherwise, check if it is a digit or a
    special character.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character ");
        char ch=sc.next().trim().charAt(0);
        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch))
                System.out.println(ch+ " is in upper case ");
            else
                System.out.println(ch+" is in  lower case");
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch+" is a digit");
        }else
            System.out.println(ch+" is a special character.");
    }
}
