package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ12 {
    // Pg 126 Q12
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Annual Salary: ");
        double salary=sc.nextDouble();
        double tax=0;
        if(salary<=250000)
            tax=0;
        else if(salary>250000 && salary<=5_00_000)
            tax= (salary-2_50_000)*0.1;
        else if (salary>5_00_000 && salary<10_00_000)
            tax=((salary-5_00_000)*0.2) +10_000;
        else
            tax=((salary - 10_00_000)*0.3)+25000;
        System.out.println("Tax to be paid "+tax);
    }
}
