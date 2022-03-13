package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ11 {
    // Pg 126 Q11
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days you are late for book submission ");
        int days=sc.nextInt();
        double fine = 0;
        if(days<=5)
            fine=days*0.4;
        else if(days>=6 && days<=10)
            fine=(0.4*5)+(days-5)*0.65;
        else if(days>10)
            fine=(0.4*5)+(0.65*5)+(days-10)*0.8;
        System.out.println("The late fine to be paid is "+fine);
    }
}
