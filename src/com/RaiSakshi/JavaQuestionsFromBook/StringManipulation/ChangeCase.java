package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class ChangeCase {
    /*
    Write a program in java to accept a string and change the case of each letter of the string and display the
    string.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        for(int i=0;i<=str.length()-1;i++)
            if(Character.isUpperCase(str.charAt(i))){
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }else if(Character.isLowerCase(str.charAt(i)))
                System.out.print(Character.toUpperCase(str.charAt(i)));
            else
                System.out.print(" ");
    }
}
