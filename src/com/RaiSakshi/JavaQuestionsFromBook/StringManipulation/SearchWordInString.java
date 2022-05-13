package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class SearchWordInString {
    /*
    Write a program in java to accept a sentence and a word separately.
    Find and print the frequency of the given string
    SampleInput: the quick brown fox jumps over the lazy dog
    word to be searched: the
    frequency of the word: 2
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        System.out.println("Enter the word to be searched");
        String word=sc.next();
        String chr=" ";
        int count =0;
        str=str.trim();
        str=str+" ";
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==' ') {
              //  System.out.println(chr);
                if(word.equals(chr.trim()))
                    count++;
                chr=" ";
            }else
                chr+=str.charAt(i);
        }
        System.out.println("The word '"+word+"' is used "+count+" times in the sentence.");
    }
}
