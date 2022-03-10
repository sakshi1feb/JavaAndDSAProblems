package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ3 {
    // Pg 125 Q3
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price of the article:");
        float price=sc.nextFloat();
        float d1=(float) 0.3*price;
        float d2= (float) ((float)( price-( 0.2*price))*0.1);
        System.out.println(((d1>d2 )?"Shopkeeper 1 is offering more discount":"Shopkeeper 2 is offering more discount") );
    }
}
