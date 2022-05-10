package com.RaiSakshi.JavaQuestionsFromBook.StringManipulation;

//import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        B L U E J
        L U E J B
        U E J B L
        E J B L U
        J B L U E
         */
        System.out.println("Enter the string ");
        String str=sc.next();
        for(int i=0;i<=str.length()-1;i++){
            System.out.print(str.substring(i,str.length()));
            System.out.println(str.substring(0,i));
        }
    }
}
