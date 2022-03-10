package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ2 {
    // Pg 125 Q2
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the printed price of the camera: ");
        int pp=sc.nextInt();
        double dp =(pp-(0.1*pp));
        double amount =dp+(0.06*dp);
        System.out.println("The amount to be paid "+amount);
    }
}
