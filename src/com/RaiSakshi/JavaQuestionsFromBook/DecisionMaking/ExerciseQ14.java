package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ14 {
//Pg 126 Q14
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter employee number: ");
    int e_no=sc.nextInt();
    System.out.println("Enter age of the employee: ");
    int age=sc.nextInt();
    System.out.println("Enter basic salary: ");
    int bs=sc.nextInt();
    System.out.println("Enter gender as 'm' for male and 'f' for female ");
    char gender=sc.next().trim().charAt(0);
    double hra=0.4*bs;
    double da=0.12*bs;
    double pf=0.02*bs;
    double gross_salary= bs+da+hra;
    double netSalary=gross_salary-(pf);
    if(gender=='m' && netSalary >250000)
        System.out.println("Income Tax Payer.");
    else if(gender=='f'&& netSalary>300000)
        System.out.println("Income Tax Payer");
    else
        System.out.println("Not an Income Tax Payer");
}
}
