package com.RaiSakshi.KunalsDSABootcamp.Conditionals_loops03.IntermediateJavaProgram;

import java.util.Scanner;

public class Q12AverageMarks {
    // A program to calculate the average marks obtained a student
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sumbjects ");
        int n=sc.nextInt();
        System.out.println("Enter total marks obtained by the student in "+n+" subjects");
        int total=sc.nextInt();
        float avg =total/n ;
        System.out.println("Average Marks obtained by the student is "+avg);

    }
}
