package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;
// book pg 100 Prog 3
public class MarksAndGrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks obrained :");
        int marks=sc.nextInt();
        if (marks >= 80) {
            System.out.println("Distinction");
        }
        if(marks>=60 && marks <80){
            System.out.println("First Division");
        }
        if(marks>=45 && marks<60 ){
            System.out.println("Second Division");
        }
        if(marks>=40 && marks<=45){
            System.out.println("Pass");
        }
        if(marks>=0&& marks<40){
            System.out.println("Fail");
        }
    }
}
