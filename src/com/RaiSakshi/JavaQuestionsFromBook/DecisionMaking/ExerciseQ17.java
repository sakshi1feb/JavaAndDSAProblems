package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ17 {
    // Pg 127 Q17
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight of the parcel in grams:");
        float weight =sc.nextInt();
        System.out.println("Enter your couriere type as 'e' for express and 'o' for ordinary ");
        char ch=sc.next().trim().charAt(0);
        double amt=0;
        if(ch=='e'){
            if(weight<=100)
                amt=80;
            else if(weight>100 && weight<=500)
                amt=80+(weight-100)*0.7;
            else
                amt=80+ (400*0.7) + (weight-500)*0.65;
        }else if(ch=='o'){
            if(weight<=100)
                amt=50;
            else if(weight>100 && weight<=500)
                amt=50+(weight-100)*0.4;
            else
                amt=50+ (400*0.4) + (weight-500)*0.35;
        }else
            System.out.println("Invalid choice");
        System.out.println("Amount to be paid for the courier "+amt);
    }
}
