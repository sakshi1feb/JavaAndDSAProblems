package com.RaiSakshi.JavaQuestionsFromBook.Arrays;

import java.util.Scanner;

/*
Write a program to accept 10 names in aSingle dimensional array. Display all those names whose
first letter matches with the letter entered by the user.
 */
public class SearchNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 names in the array");
        String[] names =new String[10];
        for(int i=0;i< names.length;i++)
            names[i]=sc.nextLine();
        System.out.println("Enter the Alphabet");
        char ch=sc.next().trim().charAt(0);
        System.out.println("The names starting with the '"+ch+"' is:\n");
        for(int i=0;i<names.length;i++){
            if(names[i].charAt(0)==ch)
                System.out.println(names[i]);
        }
    }
}
