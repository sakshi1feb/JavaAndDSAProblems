package com.RaiSakshi.KunalsDSABootcamp.Functions04;

import java.util.Scanner;

public class Q3VotingEligibility {
    // A program to check if a person is eligible to vote or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age ");
        int age=sc.nextInt();
        System.out.println("The person is "+eligible(age)+"to vote");
    }

     static String eligible(int age) {
        if(age>=18)
            return  "eligible";
        else
            return "not eligible";
    }
}
