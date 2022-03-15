package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ26 {
    // Pg 129 Q26
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Showroom price of the car ");
        int price=sc.nextInt();
        System.out.println("Enter No. of years the car has been used ");
        int years=sc.nextInt();
        double depreciatedValue=0;
        double amt;
        if (years == 1) {
            depreciatedValue = price * 0.1;
            amt = price - depreciatedValue;
        } else if (years == 2) {
            depreciatedValue = 0.2 * price;
            amt = price - depreciatedValue;
        } else if (years == 3) {
            depreciatedValue = 03 * price;
            amt = price - depreciatedValue;
        } else if (years == 4) {
            depreciatedValue=0.5*price;
            amt=price-depreciatedValue;
        }else {
            depreciatedValue =0.6*price;
            amt=price-depreciatedValue;
        }
        System.out.println("The depriciated value of the car is "+depreciatedValue);
        System.out.println("The amount paid for the car is "+amt);
    }
}
