package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ8 {
    //Pg 125 Q8
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c){
            System.out.println("The numbers are equal");
        }else {
            System.out.println("The numbers are unequal");
            int max=Math.max(a,Math.max(b,c));
            System.out.println("The maximum of the three numbers is "+max);
            if(a>=0&& b>=0&& c>=0)
                System.out.println("All the three numbers are positive");
            else if(a<0 && b<0 && c<0)
                System.out.println("All the numbers are negative");
            else
                System.out.println("Combination of positive and negative numbers");
        }
    }
}
