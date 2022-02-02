package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q24LeapYear {
    // A program to check whether a year is leap or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year ");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}
