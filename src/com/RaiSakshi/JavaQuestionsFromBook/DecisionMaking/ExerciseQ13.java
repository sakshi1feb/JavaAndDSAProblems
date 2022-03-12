package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ13 {
    // Pg 126 Q13
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks obtained in English ");
        float eng=sc.nextFloat();
        System.out.println("Enter marks obtained in Science ");
        float sci=sc.nextFloat();
        System.out.println("Enter marks obtained in Maths ");
        float maths=sc.nextFloat();
        if(eng>=80 && maths>=80 && sci>=80)
            System.out.println("Stream : Pure Science");
        else if(eng>=80 && sci>=80&& maths>=60)
            System.out.println("Stream : Bio.Science");
        else if(eng>=60 && sci>=60 && maths>=60)
            System.out.println("Stream : Commerce");
        else
            System.out.println("No stream offered here.");
    }
}
