package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class ReplaceCharacters {
/*
 Write a program to input a sentence. Create a new sentence by replacing each consonant with the previous letter.
 If the previous letter is a vowel then replace it with the next letter.(i.e. if the letter is B then replace
 it with C as the previous letter is A. And the other characters remain same.
 Sample Input : THE CAPITAL OF INDIA IS NEW DELHI
 Sample output: SGE BAQISAK OG IMCIA IR MEV CEKGL
 */
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a sentence");
    String str=sc.nextLine();
    char ch;
    int val=0;
    for(int i=0;i<=str.length()-1;i++){
        ch= Character.toUpperCase(str.charAt(i));
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch==' ')
            System.out.print(ch);
        else{
            val=(int)ch -1;
            ch=(char)val;
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                val=(int)ch+2;
                System.out.print((char)val);
            }else
                System.out.print(ch);
        }

    }
}
}
