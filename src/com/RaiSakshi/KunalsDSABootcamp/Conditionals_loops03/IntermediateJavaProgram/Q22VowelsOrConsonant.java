package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q22VowelsOrConsonant {
    /*
        A program to input a character and check if it is a vowel or a consonant
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character ");
        char ch=sc.next().trim().charAt(0);
       int l=(int)ch;
       if((l>=65&&l<=91)||(l>=97&&l<=123)){
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               System.out.println(ch +" is a vowel");
           }else{
               System.out.println(ch+ " is a consonant" );
           }
       }else{
           System.out.println(ch+" is neither a vowel nor a consonant");
       }

    }
}
