package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

import java.util.Scanner;

public class ReverseWords {
    /*
    Write a program to accept a string. Display the new string after reversing each character of the word.
    Sample Input: New Delhi is the capital of India.
    Sample Output: weN ihleD si eht latipac fo aidnI.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
      //  str=str.trim();
        String ch="",str2;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==' '){
                System.out.print(ch+" ");
                ch=" ";
            }
            else
                ch=str.charAt(i)+ch;
        }
    }
}
