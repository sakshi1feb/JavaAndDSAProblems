package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class InitialsOfName {
    /*
    Write a program to accept a name and display the initials of the name along with the surname.
    Sample Input:- Mohandas Karamchand Gandhi
    OUtput:-        M.K. Gandhi
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name ");
        String str=sc.nextLine();
        str=str.trim();
       // System.out.println(str);
        String  initials;
        initials=str.charAt(0)+". ";
        char ch = ' ';
        int p=str.lastIndexOf(ch);
        String surname=str.substring(p+1,str.length());// to get the surname
       // System.out.println(surname);
       for(int i=str.indexOf(ch);i<p ;i++){
            if(str.charAt(i)==' ')
                initials+=str.charAt(i+1)+". ";
       }
       String newName= initials+surname;
        System.out.println(newName);
    }
}
