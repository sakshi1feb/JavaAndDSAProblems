package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class No_of_DaysMonthsYears {
    // A program in java to input number of days and convert it to years, months and days
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int days=sc.nextInt();
        int years=days/365;
        int months=(days%365)/30;
        int dayss=months%30;
        System.out.println(days + "days has "+years+" years "+months+" months and "+dayss+" days.");
    }
}
