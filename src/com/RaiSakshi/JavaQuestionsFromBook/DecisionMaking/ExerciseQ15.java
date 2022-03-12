package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ15 {
    // Pg 127 Q15
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter amount of deposit ");
        int deposit=sc.nextInt();
        System.out.println("Enter term of deposit: ");
        int term=sc.nextInt();
        double amount=0;
        if(age>60){
            if(term<=1)
                amount=deposit+(0.08*deposit);
            else if(term>1&& term<=2)
                amount=deposit+(0.09*deposit);
            else if(term>2 && term<=3)
                amount=deposit+(0.1*deposit);
            else if(term>3)
                amount =deposit +(0.11*deposit);
        }else{
            if(term<=1)
                amount=deposit+(0.075*deposit);
            else if(term>1&& term<=2)
                amount=deposit+(0.085*deposit);
            else if(term>2 && term<=3)
                amount=deposit+(0.095*deposit);
            else if(term>3)
                amount =deposit +(0.1*deposit);
        }
        System.out.println("Amount to be paid after the term"+amount);
    }
}
