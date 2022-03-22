package com.RaiSakshi.JavaQuestionsFromBook.Iteration;

import java.util.Scanner;

public class Series2 {
//Pg 151 Prog 11
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(i%2==0)
            System.out.print(" -"+i+"/"+(i+1));
        else
            System.out.print(" +"+i+"/"+(i+1));
    }
}
}
