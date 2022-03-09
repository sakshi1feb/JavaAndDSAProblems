package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class IncomeTax {
    // pg 104 Prog 7
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your gender as 'm' for male and 'f' for female");
        char ch=sc.next().trim().charAt(0);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(ch=='f'|| age>65){
            System.out.println("Wrong Category");
        }else {
            System.out.println("Enter taxable amount:");
            int ti = sc.nextInt();
            double tax = 0;
            if (ti <= 160000)
                tax = 0;
            else if (ti >= 160000 && ti <= 500000) {
                tax = (ti - 160000) * 0.1;
            } else if (ti > 500000 && ti <= 800000) {
                tax = ((ti - 500000) * 0.2) + 34000;
            } else if (ti > 800000)
                tax = ((ti - 800000) * 0.3) + 94000;
            System.out.println("Tax to be paid " + tax);
        }
    }
}
