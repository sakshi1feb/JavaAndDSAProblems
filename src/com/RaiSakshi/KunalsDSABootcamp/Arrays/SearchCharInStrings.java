package com.RaiSakshi.KunalsDSABootcamp.Arrays;

import java.util.Scanner;

public class SearchCharInStrings {
    // A program to search characters in the string.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Enter the character to be searched:");
        char target=sc.next().trim().charAt(0);
        boolean result=search(str, target);
        if (result==true)
            System.out.println("The searched target is present in the string.");
        else
            System.out.println("The searched target is absent.");
    }
    static boolean search(String str, char ch){
        if(str==null)
            return false;
        else{
            for(int i=0;i<str.length();i++)
                if(str.charAt(i)==ch)
                    return true;
        return false;
        }
    }
}
