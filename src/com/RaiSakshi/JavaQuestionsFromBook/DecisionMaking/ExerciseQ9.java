package com.RaiSakshi.JavaQuestionsFromBook.DecisionMaking;

import java.util.Scanner;

public class ExerciseQ9 {
    // pg 125 Q9
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float perimeter=a+b+c;
        float s=perimeter/2;
        float area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        if(area==perimeter)
            System.out.println("The triangle is an equable triangle");
        else
            System.out.println("The triangle is not an equable triangle");

    }
}
