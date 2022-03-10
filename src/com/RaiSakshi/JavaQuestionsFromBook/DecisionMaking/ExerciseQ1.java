package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ1 {
    // Pg 125 Q1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount ");
        int p=sc.nextInt();
        int n=3;
        double r=0.05;
        // compound interest in first year
        double interest1= p*r*1;
        double amount1=p+interest1;
        System.out.println("Compound Interest at the end of 1 year "+interest1);
        double interest2=amount1*r;
        System.out.println("Compound Interest at the end of 2nd year "+interest2);
        double amount2=amount1+interest2;
        double interest3=amount2*r;
        System.out.println("Amount after three year "+(amount2+interest3));

    }
}
