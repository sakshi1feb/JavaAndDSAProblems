package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class CountVowels {
    /*
     Write a program to accept a string and count and display the number of vowels in the string.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        char s;
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            s=Character.toLowerCase(str.charAt(i));
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
                count++;
        }
        System.out.println("The number of vowels in the string is "+count);
    }
}
