package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q9CalculateBattingAverage {
    // A program to calculate the batting average in Cricket
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of runs scored by the player");
        int run=sc.nextInt();
        System.out.println("Enter the number of matches in which the player got out ");
        int out=sc.nextInt();
        double bavg=(double) run/out;
        System.out.println("Batting average of the player is "+bavg);
    }
}
