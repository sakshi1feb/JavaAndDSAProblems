package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost price of the article: ");
        float cp=sc.nextFloat();
        System.out.println("Enter Selling price of the article: ");
        float sp=sc.nextFloat();
        if(sp>cp){
            System.out.println("Profit");
            double pp=(sp-cp)*100/cp;
            System.out.println("Your profit percentage is "+pp);
        }else{
            System.out.println("loss");
            double lp=(cp-sp)*100/cp;
            System.out.println("Your loss percentage is "+lp);
        }
    }
}
