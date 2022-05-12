package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class StringCount {
    /*
    Write a program to accept a string and display the number of lower case characters, the number of upper case
    characters, the number of special characters, and the number of digits present in the string.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        int lc=0,uc=0,spc=0,dc=0;
        for(int i=0;i<=str.length()-1;i++){
            if(Character.isLetter(str.charAt(i))){
                 if(Character.isLowerCase(str.charAt(i)))
                     lc++;
                 else
                     uc++;
            }
            else if(Character.isDigit(str.charAt(i)))
                dc++;
            else
                spc++;
        }
        System.out.println("The number of lower case letters in the string is "+lc);
        System.out.println("The number of upper case letters in the string is "+uc);
        System.out.println("The number of digits in the string is "+dc);
        System.out.println("The number of special characters in the string is "+spc);
    }
}
